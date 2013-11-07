package se.phh.message;

public class Quite extends Message {
	private static final String QUITE_PREFIX = "[QUITE] ";

	public Quite() {
		super();
	}

	public String getMessage() {
		return QUITE_PREFIX + getMessageValue();
	}

}
