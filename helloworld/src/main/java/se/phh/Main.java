package se.phh;

import java.util.logging.Logger;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerJUL;
import se.phh.sayers.SayerSystemErr;
import se.phh.sayers.SayerSystemOut;
import javax.annotation.*;
public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
    private static final String MESSAGE = "Hello world!";

    public void startOfMain(){
    	logger.info("start");
    }
    
	public static void main(String[] args) {
		logger.info("start of main");
        Message message = new Message(MESSAGE);
        LoudMessage loudMessage = new LoudMessage(MESSAGE);
        QuiteMessage quiteMessage = new QuiteMessage(MESSAGE);
        Sayer sayer = new SayerSystemOut();
        sayer.say(message);
        sayer.say(loudMessage);
        sayer.say(quiteMessage);
        sayer = new SayerSystemErr();
        sayer.say(message);
        sayer.say(loudMessage);
        sayer.say(quiteMessage);
        sayer = new SayerJUL();
        sayer.say(quiteMessage);
		logger.info("end of main");
    }
    
}