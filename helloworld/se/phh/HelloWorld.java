package se.phh;

public class HelloWorld implements Say {
    
    private String theMessage;
    
    public HelloWorld(String message) {
        theMessage = message;
    }
    
    public String say() {
        return theMessage;
    }
    
}
