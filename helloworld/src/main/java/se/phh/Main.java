package se.phh;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerJUL;
import se.phh.sayers.SayerSystemErr;
import se.phh.sayers.SayerSystemOut;

public class Main {

    private static final String MESSAGE = "Hello world!";

	public static void main(String[] args) {
        Message message = new Message(MESSAGE);
        LoudMessage loudMessage = new LoudMessage(MESSAGE);
        QuiteMessage quiteMessage = new QuiteMessage(MESSAGE);
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