package se.phh;

public class HelloWorld {
    
    private String theMessage;
    
    public HelloWorld(String message) {
        theMessage = message;
    }
    
    public void sayHello() {
        System.err.println(theMessage);
    }
    
}
