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

	private static final String DEFAULT_MESSAGEVALUE = "DEFAULT MESSAGE";

	private MessageContentFactory() {
	}

	public static MessageContentFactory getInstance() {
		if (instance == null)
			instance = new MessageContentFactory();
		return instance;
	}

	public MessageContent getMessage() {
		return getMessageOfDefaultType(DEFAULT_MESSAGEVALUE);
	}

	public MessageContent getMessageOfDefaultType(String messageValue) {
		return getMessageType(MESSAGE_TYPE_DEFAULT, messageValue);
	}

	public MessageContent getMessageType(int messageType, String messageValue) {
		MessageContent returner = null;
		if (messageType == MESSAGE_TYPE_STANDARD) {
			returner = createStandard(messageValue);
		} else if (messageType == MESSAGE_TYPE_QUITE) {
			returner = createQuite(messageValue);
		} else if (messageType == MESSAGE_TYPE_LOUD) {
			returner = createLoud(messageValue);
		} else {
			returner = createStandard("[" + messageType + "] " + messageValue);
		}
		return returner;
	}

	private MessageContent createStandard(String messageValue) {
		return new Standard(messageValue);
	}

	private MessageContent createLoud(String messageValue) {
		return new Loud(messageValue);
	}

	private MessageContent createQuite(String messageValue) {
		return new Quite(messageValue);
	}
}
