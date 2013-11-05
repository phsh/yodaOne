package se.phh.generators;

import java.util.List;

import se.phh.factories.MessageContentFactory;
import se.phh.message.MessageContent;
import se.phh.pools.MessageContentPool;

public class MessageContentGenerator {
	private static MessageContentGenerator instance = null;
	private static MessageContentFactory factory = MessageContentFactory.getInstance();
	private static final String MESSAGE = "Hello world!";
	private MessageContentPool pool;

	private MessageContentGenerator() {
	}

	public static MessageContentGenerator getInstance() {
		if (instance == null) {
			instance = new MessageContentGenerator();
			instance.init();
		}

		return instance;
	}

	private void init() {
		pool = new MessageContentPool();
		pool.add(factory.getMessageType(MessageContentFactory.MESSAGE_TYPE_STANDARD,
				MESSAGE));
		pool.add(factory.getMessageType(MessageContentFactory.MESSAGE_TYPE_LOUD,
				MESSAGE));
		pool.add(factory.getMessageType(MessageContentFactory.MESSAGE_TYPE_QUITE,
				MESSAGE));

	}

	public List<MessageContent> getWhatToSay() {
		return pool.get();
	}
}