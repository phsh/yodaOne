package se.phh;

public class HelloWorld {
    
    private String theMessage;
    
    public HelloWorld(String message) {
        theMessage = message;
    }
    
    public void sayHello() {
        System.err.println(theMessage);
    }
    
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld("Hello world!");
        hello.sayHello();
    }
    
}
