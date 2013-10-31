package se.phh;

public class Message {
    
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
