package se.phh;

import se.phh.message.MessageContent;
import se.phh.world.World;
import se.phh.world.generators.MessageContentGenerator;

public class Main {
	private static MessageContentGenerator messageGenerator = MessageContentGenerator
			.getInstance();
	
	private static World WORLD = World.getInstance();

	public static void main(String... args) {
		for (MessageContent messageContent : messageGenerator.get()) {
			say(messageContent);
		}
	}

	private static void say(MessageContent messageContent) {
		WORLD.say(messageContent);
	}
}