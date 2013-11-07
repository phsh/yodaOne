package se.phh.message;

public class Standard extends Message {

	public Standard(String message) {
		super(message);
	}

	public String getMessage() {
		return this.getMessageValue();
	}

}
