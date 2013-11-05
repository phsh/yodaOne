package se.phh;

import java.util.ArrayList;
import java.util.List;

import se.phh.message.MessageContent;
import se.phh.message.MessageFactory;

public class MessageContentGenerator {
	private static MessageContentGenerator instance = null;
	private static final String MESSAGE = "Hello world!";
	
	private MessageContentGenerator() {
	}

	public static MessageContentGenerator getInstance() {
		if (instance == null)
			instance = new MessageContentGenerator();
		return instance;
	}
	
	
	public List<MessageContent> getWhatToSay() {
		List<MessageContent> whatToSay = new ArrayList<MessageContent>();
		whatToSay.add(MessageFactory.getInstance().getMessageType(
				MessageFactory.MESSAGE_TYPE_STANDARD, MESSAGE));
		whatToSay.add(MessageFactory.getInstance().getMessageType(
				MessageFactory.MESSAGE_TYPE_LOUD, MESSAGE));
		whatToSay.add(MessageFactory.getInstance().getMessageType(
				MessageFactory.MESSAGE_TYPE_QUITE, MESSAGE));
		return whatToSay;
	}
}
