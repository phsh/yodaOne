package se.phh.message;

public class Loud extends Message {
	private static final String LOUD_PREFIX = "[LOUD] ";

	public Loud() {
		super();
	}

	public StringBuilder getMessage() {
		return new StringBuilder(LOUD_PREFIX).append(getMessageValue());
	}

}
