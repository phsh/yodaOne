package se.phh.message;

public class QuiteMessage implements MessageContent {
	private Message theMessage;

	public QuiteMessage(String message) {
		this.theMessage = new Message(message);
	}

	public String getMessage() {
		return "[QUITE] " + this.theMessage.getMessage();
	}

}
