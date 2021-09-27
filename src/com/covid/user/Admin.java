package com.covid.user;

import com.covid.service.RegistrationServiceInterface;
import com.covid.service.ServiceFactory;

public class Admin{
	Long id;
	UserDetail userDetail;
	RegistrationServiceInterface regService;
	
	public Admin(UserDetail userDetail,String typeOfRegistration) {
		this.userDetail = userDetail;
		this.regService = ServiceFactory.getRegistrationService(typeOfRegistration);
	}
	 //register();
	//result();
	//updateResult();
	
	public void register(UserDetail user) {
		Long id = this.regService.registerUser(user);
		this.id = id;
	}
}
