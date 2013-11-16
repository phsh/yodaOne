package se.phh.sayers;

import se.phh.message.MessageContent;

public class SayerSystemErr implements Sayer {

	private static SayerSystemErr instance = null;

	private SayerSystemErr() {
	}

	public static SayerSystemErr getInstance() {
		if (instance == null)
			instance = new SayerSystemErr();
		return instance;
	}

	public void say(MessageContent message) {
		System.err.println(message.getMessage());
	}

}
