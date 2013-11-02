package se.phh;

import java.util.logging.Logger;

import se.phh.message.MessageContent;
import se.phh.sayers.Sayer;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String... args) {
		logger.info("start of main");
		for(MessageContent mc:WhatToSayGenerator.getInstance().getWhatToSay()){
			 sayWhat(mc);
		}
		logger.info("end of main");
    }
	
    private static void sayWhat(MessageContent mc){
    	for(Sayer s: HowToSayItGenerator.getInstance().getSayers()){
			s.say(mc);
		}
    }
}