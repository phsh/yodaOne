package se.phh;

import java.util.logging.Logger;

import se.phh.message.Message;
import se.phh.message.MessageFactory;
import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		logger.info("start of main");
		for(Message m:WhatToSayGenerator.getInstance().getWhatToSay()){
			Sayer sayer = SayerFactory.getInstance().getSayer(SayerFactory.SAYER_OUT);
	        sayer.say(m);
		}
		for(Message m:WhatToSayGenerator.getInstance().getWhatToSay()){
			Sayer sayer = SayerFactory.getInstance().getSayer(SayerFactory.SAYER_ERR);
	        sayer.say(m);
		}
		for(Message m:WhatToSayGenerator.getInstance().getWhatToSay()){
			Sayer sayer = SayerFactory.getInstance().getSayer(SayerFactory.SAYER_JUL);
	        sayer.say(m);
		}
        logger.info("end of main");
    }
    
}