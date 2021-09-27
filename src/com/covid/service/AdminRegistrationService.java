package com.covid.service;

import com.covid.repo.AdminRepo;
import com.covid.repo.RepoFactory;
import com.covid.user.UserDetail;

public class AdminRegistrationService implements RegistrationServiceInterface{
	AdminRepo adminRepo;

	public AdminRegistrationService(String repo) {
		adminRepo = RepoFactory.getAdminRepo(repo);
	}

	public Long registerUser(UserDetail user) {

		return adminRepo.insertAdmin(user);

	}
}
