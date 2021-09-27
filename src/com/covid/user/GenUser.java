package com.covid.user;


import com.covid.service.RegistrationServiceInterface;
import com.covid.service.ServiceFactory;

public class GenUser{
	
	UserDetail userDetail;
	Long id;
	RegistrationServiceInterface regService;
	
	
	public GenUser(UserDetail userDetail,String typeOfRegistration) {
		this.userDetail = userDetail;
		this.regService = ServiceFactory.getRegistrationService(typeOfRegistration);
	}
	
	
	public void register(UserDetail user) {
		Long id = this.regService.registerUser(user);
		this.id = id;
	}

}
