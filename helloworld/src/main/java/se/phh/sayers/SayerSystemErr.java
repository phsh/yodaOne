package se.phh.sayers;

import se.phh.Message;

public class SayerSystemErr implements Sayer {

	public void say(Message message) {
		System.err.println(message.getMessage());
	}

}
