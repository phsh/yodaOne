package se.phh.message;

public class MessageFactory {
	private static MessageFactory instance = null;
	public static final String MESSAGE = "MESSAGE";
	public static final String MESSAGE_QUITE = "MESSAGE_QUITE";
	public static final String MESSAGE_LOUD = "MESSAGE_LOUD";
	private MessageFactory(){}
	
	public static MessageFactory getInstance(){
		if(instance== null) instance = new MessageFactory();
		return instance;
	}
	
	public Message getMessageType(String messageType, String messageValue){
		Message returner = null;
		if(messageType.equals(MESSAGE)){
			returner  = new Message(messageValue);
		}
		if(messageType.equals(MESSAGE_QUITE)){
			returner  = new QuiteMessage(messageValue);
		}
		if(messageType.equals(MESSAGE_LOUD)){
			returner  = new LoudMessage(messageValue);
		}
		return returner;
	}
}
