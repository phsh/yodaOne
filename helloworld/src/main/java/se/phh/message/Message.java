package se.phh.message;

public class Message implements MessageContent {

	private String theMessage;

	public Message() {
		theMessage = DEFAULT;
	}

	public Message(String message) {
		theMessage = message;
	}

	public String getMessage() {
		return theMessage;
	}

}
