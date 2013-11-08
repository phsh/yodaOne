package se.phh.message;

public class Quite extends Message {
	private static final String QUITE_PREFIX = "[QUITE] ";

	public Quite() {
		super();
	}

	public StringBuilder getMessage() {
		return new StringBuilder(QUITE_PREFIX).append(getMessageValue());
	}

}
