package se.phh.sayers;

import se.phh.message.MessageContent;

public class SayerSystemErr implements Sayer {

	public void say(MessageContent message) {
		System.err.println(message.getMessage());
	}

}
