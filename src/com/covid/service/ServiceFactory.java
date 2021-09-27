package com.covid.service;

public class ServiceFactory {

	public static RegistrationServiceInterface getRegistrationService(String type) {
		if(type.equalsIgnoreCase(ServiceConstants.USER)) {
			return new UserRegistrationService(ServiceConstants.USER);
		}else if(type.equalsIgnoreCase(ServiceConstants.ADMIN)) {
			return new AdminRegistrationService(ServiceConstants.ADMIN);
		}
		return null;
	}
}
