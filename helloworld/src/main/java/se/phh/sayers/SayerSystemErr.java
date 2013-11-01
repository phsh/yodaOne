package se.phh.sayers;

import se.phh.message.Message;

public class SayerSystemErr implements Sayer {

	public void say(Message message) {
		System.err.println(message.getMessage());
	}

}
