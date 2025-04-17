package com.wp.spring.phoneapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("airtel")
@Scope("prototype")
public class AirtelSim implements Sim {
	
	public AirtelSim() {
		System.out.println("Airtel Bean Created");
	}
	

	public void call(long phnNo) {
		System.out.println("Making a call to "+phnNo);
	}
	
	public void sendText(String text, long phnNo) {
		System.out.println("Sending text : ["+text+"] to "+phnNo);
	}
	
}
