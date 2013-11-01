package se.phh;

import java.util.logging.Logger;

import se.phh.message.Message;
import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		logger.info("start of main");
		for(Message m:WhatToSayGenerator.getInstance().getWhatToSay()){
			for(Sayer s: HowToSayItGenerator.getInstance().getSayers()){
				s.say(m);
			} 
		}
		logger.info("end of main");
    }
    
}