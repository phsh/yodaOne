package se.phh;

import java.util.logging.Logger;

import se.phh.message.Message;
import se.phh.message.MessageFactory;
import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
    private static final String MESSAGE = "Hello world!";

	public static void main(String[] args) {
		logger.info("start of main");
		Message message = MessageFactory.getInstance().getMessageType(MessageFactory.MESSAGE, MESSAGE);
        Message loudMessage = MessageFactory.getInstance().getMessageType(MessageFactory.MESSAGE_LOUD, MESSAGE);
        Message quiteMessage = MessageFactory.getInstance().getMessageType(MessageFactory.MESSAGE_QUITE, MESSAGE);
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