package se.phh.world;

import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;
import se.phh.world.generators.SayerGenerator;

public class World {
	private static World instance = null;

	private World() {
	}

	public static World getInstance() {
		if (instance == null)
			instance = new World();
		return instance;
	}

	public void say(Sayer sayer, MessageContent messageContent) {
		sayer.say(messageContent);
	}
	
	public void say(MessageContent messageContent){
		for(Sayer sayer : SayerGenerator.getInstance().get()){
			sayer.say(messageContent);
		}
	}
}
