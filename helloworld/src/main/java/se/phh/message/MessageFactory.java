package se.phh.message;

public class MessageFactory {
	private static MessageFactory instance = null;
	public static final String MESSAGE = "MESSAGE";
	public static final String MESSAGE_QUITE = "MESSAGE_QUITE";
	public static final String MESSAGE_LOUD = "MESSAGE_LOUD";
	public static final String MESSAGE_DEFAULT = "DEFAULT";
	private MessageFactory(){}
	
	public static MessageFactory getInstance(){
		if(instance== null) instance = new MessageFactory();
		return instance;
	}
	
	public MessageContent getMessageType(String messageValue){
		return getMessageType(MESSAGE_DEFAULT,messageValue);
	}
	
	public MessageContent getMessageType(String messageType, String messageValue){
		MessageContent returner = null;
		if(messageType.equals(MESSAGE)){
			returner  = new Message(messageValue);
		} else if(messageType.equals(MESSAGE_QUITE)){
			returner  = new QuiteMessage(messageValue);
		} else if(messageType.equals(MESSAGE_LOUD)){
			returner  = new LoudMessage(messageValue);
		} else {
			returner = getMessageType(MessageFactory.MESSAGE, "[" + messageType + "] "+messageValue);
		}
		
		return returner;
	}
}
