package se.phh;

import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;
import se.phh.util.Timer;
import se.phh.generators.MessageContentGenerator;
import se.phh.generators.SayerGenerator;

public class Main {
	private static MessageContentGenerator messageContentGenerator = MessageContentGenerator
			.getInstance();
	private static SayerGenerator sayerGenerator = SayerGenerator.getInstance();

	public static void main(String... args) {
		Timer timer = new Timer(Main.class.getName());
		timer.startTimer();
		for (MessageContent mc : messageContentGenerator.get()) {
			sayWhat(mc);
		}
		timer.stopTime();
	}

	private static void sayWhat(MessageContent mc) {
		for (Sayer s : sayerGenerator.get()) {
			s.say(mc);
		}
	}
}