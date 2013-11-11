package se.phh.message;

public class Quite extends Message {

	public Quite() {
		super();
	}

	public StringBuilder getMessage() {
		return new StringBuilder(PrefixMessages.QUITE).append(' ').append(getMessageValue());
	}

}
