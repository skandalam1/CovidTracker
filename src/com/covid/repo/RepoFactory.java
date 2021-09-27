package com.covid.repo;

import com.covid.id.generator.Constants;
import com.covid.repo.impl.AdminRepoImpl;
import com.covid.repo.impl.UserRepoImpl;
import com.covid.service.ServiceConstants;

public class RepoFactory {

	public static UserRepo getUserRepo(String type) {
		if(type.equalsIgnoreCase(ServiceConstants.USER))
			return new UserRepoImpl(Constants.NATIVE);
		return null;
	}
	
	public static AdminRepo getAdminRepo(String type) {
		if(type.equalsIgnoreCase(ServiceConstants.ADMIN))
			return new AdminRepoImpl(Constants.NATIVE);
		return null;
	}
}
