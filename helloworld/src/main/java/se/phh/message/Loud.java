package se.phh.message;

public class Loud extends Message {
	
	public Loud() {
		super();
	}

	public StringBuilder getMessage() {
		return new StringBuilder(PrefixMessages.LOUD).append(' ').append(getMessageValue());
	}

}
