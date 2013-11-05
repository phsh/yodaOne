package se.phh.message;

public class LoudMessage implements MessageContent {
	private Message theMessage;
	private static final String LOUD_PREFIX = "[LOUD] ";

	public LoudMessage(String message) {
		theMessage = new Message(LOUD_PREFIX + message);
	}

	public String getMessage() {
		return theMessage.getMessage();
	}

}
