package se.phh.sayers;

public class SayerFactory {
	private static SayerFactory instance = null;
	public  static final String SAYER_OUT="SAYER_OUT";
	public static final String SAYER_ERR="SAYER_ERR";
	public  static final String SAYER_JUL= "SAYER_JUL";
	public static final String SAYER_DEFAULT="DEFAULT";
	private SayerFactory(){
		
	}
	
	public static SayerFactory getInstance(){
		if(instance==null) instance = new  SayerFactory();
		return instance;
	}
	
	public Sayer getSayer(){
		return getSayer(SayerFactory.SAYER_DEFAULT);
	}
	
	public Sayer getSayer(String typeOfSayer){
		Sayer returner = null;
		if(typeOfSayer.equals(SAYER_OUT)){
			returner = new SayerSystemOut();
		} else if(typeOfSayer.equals(SAYER_ERR)){
			returner = new SayerSystemErr();
		} else if(typeOfSayer.equals(SAYER_JUL)){
			returner = new SayerJUL();
		}
		if(returner == null){
			returner = getSayer(SAYER_OUT);
		}
		return returner;
	}
}
