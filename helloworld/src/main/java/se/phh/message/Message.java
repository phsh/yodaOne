package se.phh.message;

public abstract class Message implements MessageContent {
	private String messageValue;

	public Message() {
	}

	public final String getMessageValue() {
		return messageValue;
	}
	
	public void setMessageValue(String messageValue){
		this.messageValue = messageValue;
	}
}
