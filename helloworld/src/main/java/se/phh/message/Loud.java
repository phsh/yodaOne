package se.phh.message;

public class Loud extends Message {

	private static final String LOUD_PREFIX = "[LOUD] ";

	public Loud(String messageValue) {
		super(messageValue);
	}

	public String getMessage() {
		return LOUD_PREFIX + getMessageValue();
	}

}
