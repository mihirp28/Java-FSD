package com.wp.spring.phoneapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Phone implements InitializingBean, DisposableBean{

	@Autowired
	@Qualifier("jio")
	private Sim sim;
	
	@Value("${phone.brand}")
	private String brand;
	@Value("${phone.ram}")
	private int ram;
	@Value("${phone.storage}")
	private int storage;
	
	
	public Phone() {
		System.out.println("Phone Bean Created");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("All the properties are set");
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void call(long phnNo) {
		sim.call(phnNo);
	}
	
	public void sendSms(String text, long phnNo) {
		
		sim.sendText(text, phnNo);
	}
	
	public void showSimInfo() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Phone [sim=" + sim.getClass().getSimpleName() + ", brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
			
	
}
