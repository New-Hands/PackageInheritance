package com.lstroom;

public class livingRoom extends Room{
	private String sofa;
	public livingRoom(double x) {
		super(x);
		sofa="在沙发上看电视";
	}
	public void print(){
		System.out.println("在"+space+"平米的空间里我能"+sofa);
	}
	
}
