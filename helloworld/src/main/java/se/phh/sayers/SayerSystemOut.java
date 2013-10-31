package se.phh.sayers;

import se.phh.Message;


public class SayerSystemOut implements Sayer {
	
	public SayerSystemOut(){}
	
	public void say(Message m) {
		System.out.println(m.getMessage());
	}

}
