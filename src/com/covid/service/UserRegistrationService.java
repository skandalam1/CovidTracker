package com.covid.service;

import com.covid.repo.RepoFactory;
import com.covid.repo.UserRepo;
import com.covid.user.UserDetail;

public class UserRegistrationService implements RegistrationServiceInterface{

	UserRepo userRepo;

	UserRegistrationService(String repo){
		userRepo = RepoFactory.getUserRepo(repo);
	}
	public Long registerUser(UserDetail user) {

		return userRepo.insertUser(user);

	}
}
