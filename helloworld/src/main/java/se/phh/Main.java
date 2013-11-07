package se.phh;

import java.util.logging.Logger;

import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;
import se.phh.util.Timer;
import se.phh.generators.MessageContentGenerator;
import se.phh.generators.SayerGenerator;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	
	private static MessageContentGenerator messageContentGenerator = MessageContentGenerator.getInstance();
	private static SayerGenerator sayerGenerator = SayerGenerator.getInstance();
	
	public static void main(String... args) {
		Timer timer = new Timer(Main.class.getName());
		timer.startTimer();
		logger.info("start of main");
		for (MessageContent mc : 
				messageContentGenerator.get()) {
			sayWhat(mc);
		}
		logger.info("end of main");
		timer.stopTime();
		logger.info(timer.toString());
	}

	private static void sayWhat(MessageContent mc) {
		for (Sayer s : sayerGenerator.get()) {
			s.say(mc);
		}
	}
}