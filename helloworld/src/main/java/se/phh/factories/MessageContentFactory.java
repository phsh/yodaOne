package se.phh.factories;

import se.phh.message.LoudMessage;
import se.phh.message.Message;
import se.phh.message.MessageContent;
import se.phh.message.QuiteMessage;

public class MessageContentFactory {
	private static MessageContentFactory instance = null;
	public static final String MESSAGE_TYPE_STANDARD = "MESSAGE";
	public static final String MESSAGE_TYPE_QUITE = "MESSAGE_QUITE";
	public static final String MESSAGE_TYPE_LOUD = "MESSAGE_LOUD";
	public static final String MESSAGE_TYPE_DEFAULT = "DEFAULT";

	private MessageContentFactory() {
	}

	public static MessageContentFactory getInstance() {
		if (instance == null)
			instance = new MessageContentFactory();
		return instance;
	}

	public MessageContent getMessage() {
		return getMessageType(MessageContentFactory.MESSAGE_TYPE_STANDARD);
	}

	public MessageContent getMessageType(String messageValue) {
		return getMessageType(MESSAGE_TYPE_DEFAULT, messageValue);
	}

	public MessageContent getMessageType(String messageType, String messageValue) {
		MessageContent returner = null;
		if (messageType.equals(MESSAGE_TYPE_STANDARD)) {
			returner = new Message(messageValue);
		} else if (messageType.equals(MESSAGE_TYPE_QUITE)) {
			returner = new QuiteMessage(messageValue);
		} else if (messageType.equals(MESSAGE_TYPE_LOUD)) {
			returner = new LoudMessage(messageValue);
		} else {
			returner = getMessageType(MessageContentFactory.MESSAGE_TYPE_STANDARD, "["
					+ messageType + "] " + messageValue);
		}
		return returner;
	}
}
