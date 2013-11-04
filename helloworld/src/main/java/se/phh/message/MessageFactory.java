package se.phh.message;

public class MessageFactory {
	private static MessageFactory instance = null;
	public static final String MESSAGE_TYPE_STANDARD = "MESSAGE";
	public static final String MESSAGE_TYPE_QUITE = "MESSAGE_QUITE";
	public static final String MESSAGE_TYPE_LOUD = "MESSAGE_LOUD";
	public static final String MESSAGE_TYPE_DEFAULT = "DEFAULT";

	private MessageFactory() {
	}

	public static MessageFactory getInstance() {
		if (instance == null)
			instance = new MessageFactory();
		return instance;
	}

	public MessageContent getMessage() {
		return getMessageType(MessageFactory.MESSAGE_TYPE_STANDARD);
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
			returner = getMessageType(MessageFactory.MESSAGE_TYPE_STANDARD, "["
					+ messageType + "] " + messageValue);
		}

		return returner;
	}
}
