package se.phh.message;

public class Standard implements MessageContent {

	private String theMessage;

	public Standard() {
		theMessage = DEFAULT;
	}

	public Standard(String message) {
		theMessage = message;
	}

	public String getMessage() {
		return theMessage;
	}

}
