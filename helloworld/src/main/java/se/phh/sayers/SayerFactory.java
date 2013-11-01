package se.phh.sayers;

public class SayerFactory {
	private static SayerFactory instance = null;
	public  static final String SAYER_OUT="SAYER_OUT";
	public static final String SAYER_ERR="SAYER_ERR";
	public  static final String SAYER_JUL= "SAYER_JUL";
	private SayerFactory(){
		
	}
	
	public static SayerFactory getInstance(){
		if(instance==null) instance = new  SayerFactory();
		return instance;
	}
	
	public Sayer getSayer(String typeOfSayer){
		Sayer returner = null;
		if(typeOfSayer.equals(SAYER_OUT)){
			returner = new SayerSystemOut();
		}
		if(typeOfSayer.equals(SAYER_ERR)){
			returner = new SayerSystemErr();
		}
		if(typeOfSayer.equals(SAYER_JUL)){
			returner = new SayerJUL();
		}
		return returner;
	}
}
