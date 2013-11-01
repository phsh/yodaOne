package se.phh;

import java.util.logging.Logger;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;
import se.phh.sayers.SayerJUL;
import se.phh.sayers.SayerSystemErr;
import se.phh.sayers.SayerSystemOut;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
    private static final String MESSAGE = "Hello world!";

	public static void main(String[] args) {
		logger.info("start of main");
        Message message = new Message(MESSAGE);
        LoudMessage loudMessage = new LoudMessage(MESSAGE);
        QuiteMessage quiteMessage = new QuiteMessage(MESSAGE);
        Sayer sayer = SayerFactory.getInstance().getSayer(SayerFactory.SAYER_OUT);
        sayer.say(message);
        sayer.say(loudMessage);
        sayer.say(quiteMessage);
        sayer = SayerFactory.getInstance().getSayer(SayerFactory.SAYER_ERR);
        sayer.say(message);
        sayer.say(loudMessage);
        sayer.say(quiteMessage);
        sayer = SayerFactory.getInstance().getSayer(SayerFactory.SAYER_JUL);
        sayer.say(quiteMessage);
		logger.info("end of main");
    }
    
}