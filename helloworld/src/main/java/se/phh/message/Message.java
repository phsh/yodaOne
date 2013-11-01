package se.phh.message;

public class Message implements MessageContent{
    
    private String theMessage;
    
    public void startUp(){
    	System.out.print("startUp ");
    }
    
    public Message(String message) {
        theMessage = message;
    }
    
    public String getMessage() {
        return theMessage;
    }
    
}
