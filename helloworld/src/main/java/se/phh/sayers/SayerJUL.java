package se.phh.sayers;

import se.phh.message.MessageContent;

import java.util.logging.Logger;

public class SayerJUL implements Sayer {
	private static Logger logger = Logger.getLogger(SayerJUL.class.getName());

	private static SayerJUL instance = null;

	private SayerJUL() {
	}

	public static SayerJUL getInstance() {
		if (instance == null)
			instance = new SayerJUL();
		return instance;
	}

	public void say(MessageContent messageContent) {
		logger.fine(messageContent.getMessage().toString());
		logger.finer(messageContent.getMessage().toString());
		logger.finest(messageContent.getMessage().toString());
		logger.info(messageContent.getMessage().toString());
		logger.config(messageContent.getMessage().toString());
		logger.warning(messageContent.getMessage().toString());
		logger.severe(messageContent.getMessage().toString());
	}

}
