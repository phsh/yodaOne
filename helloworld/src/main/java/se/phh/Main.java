package se.phh;

import se.phh.generators.MessageContentGenerator;
import se.phh.message.MessageContent;
import se.phh.world.World;

public class Main {
	private static MessageContentGenerator messageGenerator = MessageContentGenerator
			.getInstance();

	public static void main(String... args) {
		for (MessageContent mc : messageGenerator.get()) {
			sayWhat(mc);
		}
	}

	private static void sayWhat(MessageContent messageContent) {
		World.getInstance().say(messageContent);
	}
}