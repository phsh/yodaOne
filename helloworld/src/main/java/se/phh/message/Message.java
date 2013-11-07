package se.phh.message;

public abstract class Message implements MessageContent {
	private String messageValue;

	public Message(String messageValue) {
		this.messageValue = messageValue;
	}

	public final String getMessageValue() {
		return messageValue;
	}
}
