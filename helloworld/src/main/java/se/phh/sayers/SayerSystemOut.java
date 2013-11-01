package se.phh.sayers;

import se.phh.message.Message;


public class SayerSystemOut implements Sayer {
	
	public SayerSystemOut(){}
	
	public void say(Message m) {
		System.out.println(m.getMessage());
	}

}
