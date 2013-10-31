package se.phh;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerSystemOut;

public class Main {

    public static void main(String[] args) {
        Message hello = new Message("Hello world!");
        Sayer sayer = new SayerSystemOut();
        sayer.say(hello);
    }
    
}