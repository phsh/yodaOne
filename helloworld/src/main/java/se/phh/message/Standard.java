package se.phh.message;

public class Standard extends Message {

	public Standard() {
		super();
	}

	public StringBuilder getMessage() {
		return new StringBuilder(this.getMessageValue());
	}

}
