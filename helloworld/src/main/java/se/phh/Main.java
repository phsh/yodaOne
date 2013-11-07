package se.phh;

import se.phh.generators.MessageContentGenerator;
import se.phh.generators.SayerGenerator;
import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;
import se.phh.world.World;

public class Main {
	private static MessageContentGenerator messageGenerator = MessageContentGenerator
			.getInstance();
	private static SayerGenerator sayerGenerator = SayerGenerator.getInstance();

	public static void main(String... args) {
		for (MessageContent mc : messageGenerator.get()) {
			sayWhat(mc);
		}
	}

	private static void sayWhat(MessageContent mc) {
		for (Sayer s : sayerGenerator.get()) {
			World.getInstance().sayHello(s, mc);
		}
	}
}