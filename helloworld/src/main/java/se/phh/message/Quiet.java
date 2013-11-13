package se.phh.message;

public class Quiet extends Message {

	public Quiet() {
		super();
	}

	public StringBuilder getMessage() {
		return new StringBuilder(PrefixMessages.QUITE).append(' ').append(getMessageValue());
	}

}
