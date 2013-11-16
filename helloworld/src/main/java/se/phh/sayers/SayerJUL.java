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

	public void say(MessageContent message) {
		logger.fine(message.getMessage().toString());
		logger.finer(message.getMessage().toString());
		logger.finest(message.getMessage().toString());
		logger.info(message.getMessage().toString());
		logger.config(message.getMessage().toString());
		logger.warning(message.getMessage().toString());
		logger.severe(message.getMessage().toString());
	}

}
