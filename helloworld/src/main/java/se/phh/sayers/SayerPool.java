package se.phh.sayers;

import java.util.ArrayList;
import java.util.List;
public class SayerPool {
	
	private List<Sayer> listOfSayers = new ArrayList<Sayer>();
	
	public SayerPool(){}
	
	public void add(Sayer s){
		listOfSayers.add(s);
	}
	public List<Sayer> get(){
		return listOfSayers;
	}
}
