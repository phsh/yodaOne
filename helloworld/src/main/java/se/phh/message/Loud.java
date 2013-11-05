package se.phh.message;

public class Loud implements MessageContent {
	private Standard theMessage;
	private static final String LOUD_PREFIX = "[LOUD] ";

	public Loud(String message) {
		theMessage = new Standard(LOUD_PREFIX + message);
	}

	public String getMessage() {
		return theMessage.getMessage();
	}

}
