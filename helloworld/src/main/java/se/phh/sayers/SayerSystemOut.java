package se.phh.sayers;

import se.phh.message.MessageContent;

public class SayerSystemOut implements Sayer {

	public SayerSystemOut() {
	}

	public void say(MessageContent m) {
		System.out.println(m.getMessage());
	}

}
