package se.phh;

import java.util.logging.Logger;

import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String... args) {
		logger.info("start of main");
		for(MessageContent mc:WhatToSayGenerator.getInstance().getWhatToSay()){
			for(Sayer s: HowToSayItGenerator.getInstance().getSayers()){
				s.say(mc);
			} 
		}
		logger.info("end of main");
    }
    
}