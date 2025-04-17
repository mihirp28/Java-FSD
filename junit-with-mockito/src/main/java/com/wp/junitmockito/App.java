package com.wp.junitmockito;

import com.wp.junitmockito.service.AppService;

/**
 * Hello world!
 *
 */
public class App 
{
   
	private AppService service;
	
	
	
	public AppService getService() {
		return service;
	}



	public void setService(AppService service) {
		this.service = service;
	}



	public boolean checkValue() {
		return service.check();
	}
	
}
