package se.phh;

import java.util.logging.Logger;

import se.phh.message.Message;
import se.phh.sayers.SayerFactory;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		logger.info("start of main");
		for(Message m:WhatToSayGenerator.getInstance().getWhatToSay()){
			SayerFactory.getInstance().getSayer(SayerFactory.SAYER_OUT).say(m);
			SayerFactory.getInstance().getSayer(SayerFactory.SAYER_ERR).say(m);
			SayerFactory.getInstance().getSayer(SayerFactory.SAYER_JUL).say(m);
		}logger.info("end of main");
    }
    
}