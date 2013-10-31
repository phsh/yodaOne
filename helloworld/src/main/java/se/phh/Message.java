package se.phh;

import javax.annotation.PostConstruct;
public class Message {
    
    private String theMessage;
    
    @PostConstruct
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
