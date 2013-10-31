package se.phh;

public class LoudMessage extends Message {

	public LoudMessage(String message) {
		super(message);
	}
	
	public String getMessage(){
		return "[LOUD] " + super.getMessage();
	}

}
