package com.lstroom;

public class bedRoom extends Room{
	protected String bed;
	public bedRoom(double x) {
		super(x);
		bed="在床上睡觉";
	}
	public void print(){
		System.out.println("在"+space+"平米的空间里我能"+bed);
	}
	
}