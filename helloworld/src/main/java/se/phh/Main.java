package se.phh;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerSystemErr;
import se.phh.sayers.SayerSystemOut;

public class Main {

    public static void main(String[] args) {
        Message message = new Message("Hello world!");
        Sayer sayer = new SayerSystemOut();
        sayer.say(message);
        sayer = new SayerSystemErr();
        sayer.say(message);
    }
    
}