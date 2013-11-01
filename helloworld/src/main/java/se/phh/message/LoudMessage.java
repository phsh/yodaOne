package se.phh.message;

public class LoudMessage implements MessageContent {
	private Message theMessage;
	
	public LoudMessage(String message) {
		theMessage = new Message("[LOUD] "+ message);
	}
	
	public String getMessage() {
		return theMessage.getMessage();
	}
	
}
