package se.phh.sayers;

import se.phh.Message;
import java.util.logging.*;

public class SayerJUL implements Sayer{
	private static Logger logger = Logger.getLogger(SayerJUL.class.getName());

	public void say(Message message) {
		logger.fine(message.getMessage());
		logger.finer(message.getMessage());
		logger.finest(message.getMessage());
		logger.info(message.getMessage());
		logger.config(message.getMessage());
		logger.warning(message.getMessage());
		logger.severe(message.getMessage());
	}

}
