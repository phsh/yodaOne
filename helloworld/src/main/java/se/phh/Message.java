package se.phh;

public class Message implements Say {
    
    private String theMessage;
    
    public Message(String message) {
        theMessage = message;
    }
    
    public String say() {
        return theMessage;
    }
    
}
