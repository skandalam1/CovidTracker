package com.covid.repo.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.covid.id.generator.IdGeneratorFactory;
import com.covid.id.generator.IdGeneratorInterface;
import com.covid.model.UserModel;
import com.covid.repo.AdminRepo;
import com.covid.user.UserDetail;

public class AdminRepoImpl implements AdminRepo {
	Map<Long,UserModel> admin;
	IdGeneratorInterface generator;
	
	public AdminRepoImpl(String idGeneration){
		generator = IdGeneratorFactory.getIdGenerator(idGeneration);
		admin = new ConcurrentHashMap<Long,UserModel>();
	}
	
	
	
	@Override
	public Long insertAdmin(UserDetail user) {
		Long id = generator.generateId();
		admin.put(id, new UserModel(Long.valueOf(id),user));
		return id;
	}
}
