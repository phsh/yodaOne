package se.phh.sayers;

import se.phh.message.MessageContent;

public class SayerSystemOut implements Sayer {

	private static SayerSystemOut instance = null;

	private SayerSystemOut() {
	}

	public static SayerSystemOut getInstance() {
		if (instance == null)
			instance = new SayerSystemOut();
		return instance;
	}

	public void say(MessageContent m) {
		System.out.println(m.getMessage());
	}

}
