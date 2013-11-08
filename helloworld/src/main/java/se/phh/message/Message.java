package se.phh.message;

public abstract class Message implements MessageContent {
	private StringBuilder messageValue;

	public Message() {
	}

	public final StringBuilder getMessageValue() {
		return messageValue;
	}

	public void setMessageValue(StringBuilder messageValue) {
		this.messageValue = messageValue;
	}
}
