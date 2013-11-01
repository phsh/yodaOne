package se.phh;

import java.util.ArrayList;
import java.util.List;

import se.phh.message.Message;
import se.phh.message.MessageFactory;

public class WhatToSayGenerator {
	private static WhatToSayGenerator instance = null;
	private static final String MESSAGE = "Hello world!";
	
	private WhatToSayGenerator() {
	}

	public static WhatToSayGenerator getInstance() {
		if (instance == null)
			instance = new WhatToSayGenerator();
		return instance;
	}

	public List<Message> getWhatToSay() {
		List<Message> whatToSay = new ArrayList<Message>();
		whatToSay.add(MessageFactory.getInstance().getMessageType(
				MessageFactory.MESSAGE, MESSAGE));
		whatToSay.add(MessageFactory.getInstance().getMessageType(
				MessageFactory.MESSAGE_LOUD, MESSAGE));
		whatToSay.add(MessageFactory.getInstance().getMessageType(
				MessageFactory.MESSAGE_QUITE, MESSAGE));
		return whatToSay;
	}
}
