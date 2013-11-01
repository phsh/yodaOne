package se.phh.message;

public class LoudMessage extends Message {

	public LoudMessage(String message) {
		super(message);
	}
	
	public String getMessage(){
		return "[LOUD] " + super.getMessage();
	}

}
