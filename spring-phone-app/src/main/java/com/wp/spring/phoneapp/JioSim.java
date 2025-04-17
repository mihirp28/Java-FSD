package com.wp.spring.phoneapp;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
@Scope("prototype")
@Lazy
public class JioSim implements Sim {

	public JioSim() {
		System.out.println("Jio Bean Created");
	}
	
	public void call(long phnNo) {
		System.out.println("Making a call to "+phnNo);
	}
	
	public void sendText(String text, long phnNo) {
		System.out.println("Sending text : ["+text+"] to "+phnNo);
	}
	
}
