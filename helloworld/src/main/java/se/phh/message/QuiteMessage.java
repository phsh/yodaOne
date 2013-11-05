package se.phh.message;

public class QuiteMessage implements MessageContent {
	private Message theMessage;
	private static final String QUITE_PREFIX = "[QUITE] ";

	public QuiteMessage(String message) {
		this.theMessage = new Message(QUITE_PREFIX + message);
	}

	public String getMessage() {
		return theMessage.getMessage();
	}

}
