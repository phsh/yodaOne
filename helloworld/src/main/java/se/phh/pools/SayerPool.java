package se.phh.pools;

import java.util.ArrayList;
import java.util.List;

import se.phh.sayers.Sayer;
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
