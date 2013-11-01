package se.phh.message;

public class QuiteMessage extends Message {

	public QuiteMessage(String message) {
		super(message);
	}
	
	public String getMessage(){
		return "[QUITE] "+super.getMessage();
	}

}
