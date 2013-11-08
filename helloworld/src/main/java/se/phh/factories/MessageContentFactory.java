package se.phh.factories;

import se.phh.message.Loud;
import se.phh.message.Standard;
import se.phh.message.MessageContent;
import se.phh.message.Quite;

public class MessageContentFactory {
	private static MessageContentFactory instance = null;

	public static final int MESSAGE_TYPE_STANDARD = 1000;
	public static final int MESSAGE_TYPE_QUITE = 1001;
	public static final int MESSAGE_TYPE_LOUD = 1002;
	public static final int MESSAGE_TYPE_DEFAULT = 1;

	private MessageContentFactory() {
	}

	public static MessageContentFactory getInstance() {
		if (instance == null)
			instance = new MessageContentFactory();
		return instance;
	}

	public MessageContent getMessageOfDefaultType(StringBuilder messageValue) {
		return getMessageType(MESSAGE_TYPE_DEFAULT, messageValue);
	}

	public MessageContent getMessageType(int messageType,
			StringBuilder messageValue) {
		StringBuilder setMessageValue = messageValue;
		MessageContent returner = getMessageContent(messageType);
		if (returner == null) {
			returner = new Standard();
			setMessageValue = new StringBuilder("[").append(messageType)
					.append("] ").append(messageValue);
		}
		returner.setMessageValue(setMessageValue);
		return returner;
	}

	private MessageContent getMessageContent(int messageType) {
		MessageContent messageContent = null;
		if (messageType == MESSAGE_TYPE_STANDARD) {
			messageContent = new Standard();
		} else if (messageType == MESSAGE_TYPE_QUITE) {
			messageContent = new Quite();
		} else if (messageType == MESSAGE_TYPE_LOUD) {
			messageContent = new Loud();
		}
		return messageContent;
	}
}
