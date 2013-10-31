package se.phh;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerJUL;
import se.phh.sayers.SayerSystemErr;
import se.phh.sayers.SayerSystemOut;

public class Main {

    public static void main(String[] args) {
        Message message = new Message("Hello world!");
        LoudMessage loudMessage = new LoudMessage("Hello world!");
        QuiteMessage quiteMessage = new QuiteMessage("Hello world!");
        Sayer sayer = new SayerSystemOut();
        sayer.say(message);
        sayer.say(loudMessage);
        sayer.say(quiteMessage);
        sayer = new SayerSystemErr();
        sayer.say(message);
        sayer.say(loudMessage);
        sayer.say(quiteMessage);
        sayer = new SayerJUL();
        sayer.say(quiteMessage);
    }
    
}