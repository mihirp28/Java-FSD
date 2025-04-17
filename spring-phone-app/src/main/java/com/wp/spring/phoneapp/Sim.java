package com.wp.spring.phoneapp;

public interface Sim {

	public void call(long phnNo);
	public void sendText(String text, long phnNo) ;
}
