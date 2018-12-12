package com.portable.potty.service;

import java.util.ArrayList;
import java.util.List;

import com.portable.potty.model.Call;

public class RunListService {
	
	public List<Call> getCalls(){
		List<Call> calls = new ArrayList<Call>();
		//calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", "(403)000-0001", "Fake Company"));
		//calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5", "(403)000-0002", "Fakes-R-Us"));
		return calls;
	}
	
	public List<Call> optimizeCalls(List<Call> calls){
		List<Call> optimizedCalls = new ArrayList<Call>();
		
		return optimizedCalls;
	}

}
