package se.phh.message;

public class Quite implements MessageContent {
	private Standard theMessage;
	private static final String QUITE_PREFIX = "[QUITE] ";

	public Quite(String message) {
		this.theMessage = new Standard(QUITE_PREFIX + message);
	}

	public String getMessage() {
		return theMessage.getMessage();
	}

}
