package se.phh.world;

import se.phh.generators.SayerGenerator;
import se.phh.message.MessageContent;
import se.phh.pools.SayerPool;
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

	public void say(Sayer sayer, MessageContent messageContent) {
		sayer.say(messageContent);
	}
	
	public void say(MessageContent messageContent){
		for(Sayer s : SayerGenerator.getInstance().get()){
			s.say(messageContent);
		}
	}
}
