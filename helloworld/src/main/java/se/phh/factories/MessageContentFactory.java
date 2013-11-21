package se.phh.factories;

import se.phh.message.Loud;
import se.phh.message.Quiet;
import se.phh.message.Standard;
import se.phh.message.MessageContent;

public class MessageContentFactory {
	private static MessageContentFactory instance = null;

	public static final int MESSAGE_TYPE_STANDARD = 1000;
	public static final int MESSAGE_TYPE_QUIET = 1001;
	public static final int MESSAGE_TYPE_LOUD = 1002;
	public static final int MESSAGE_TYPE_DEFAULT = 1;

	private MessageContentFactory() {
	}

	public static MessageContentFactory getInstance() {
		if (instance == null)
			instance = new MessageContentFactory();
		return instance;
	}

	public MessageContent getMessageType(int messageType,
			StringBuilder messageValue) {
		StringBuilder setMessageValue = messageValue;
		MessageContent messageContent = getMessageContent(messageType);
		if (messageContent == null) {
			messageContent = new Standard();
			setMessageValue = new StringBuilder("[").append(messageType)
					.append("] ").append(messageValue);
		}
		messageContent.setMessageValue(setMessageValue);
		return messageContent;
	}

	private MessageContent getMessageContent(int messageType) {
		MessageContent messageContent = null;
		if (messageType == MESSAGE_TYPE_STANDARD) {
			messageContent = new Standard();
		} else if (messageType == MESSAGE_TYPE_QUIET) {
			messageContent = new Quiet();
		} else if (messageType == MESSAGE_TYPE_LOUD) {
			messageContent = new Loud();
		}
		return messageContent;
	}
}
