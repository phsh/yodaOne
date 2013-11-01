package se.phh;

import java.util.ArrayList;
import java.util.List;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;

public class HowToSayItGenerator {
	private static HowToSayItGenerator instance = null;
	
	private HowToSayItGenerator(){}

	public static HowToSayItGenerator getInstance(){	
		if( instance == null )	instance = new HowToSayItGenerator();
		return instance;
	}
	public List<Sayer> getSayers(){
		List<Sayer> returner = new ArrayList<Sayer>();
		returner.add(SayerFactory.getInstance().getSayer(SayerFactory.SAYER_OUT));
		returner.add(SayerFactory.getInstance().getSayer(SayerFactory.SAYER_ERR));
		returner.add(SayerFactory.getInstance().getSayer(SayerFactory.SAYER_JUL));
		return returner;
	}
}
