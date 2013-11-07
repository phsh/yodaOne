package se.phh.world;

import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;

public class World {
	private static World instance = null;

	private World() {
	}

	public static World getInstance() {
		if (instance == null)
			instance = new World();
		return instance;
	}

	public void sayHello(Sayer sayer, MessageContent messageContent) {
		sayer.say(messageContent);
	}
}
