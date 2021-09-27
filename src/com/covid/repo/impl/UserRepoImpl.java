package com.covid.repo.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.covid.id.generator.IdGeneratorFactory;
import com.covid.id.generator.IdGeneratorImpl;
import com.covid.id.generator.IdGeneratorInterface;
import com.covid.model.UserModel;
import com.covid.repo.UserRepo;
import com.covid.user.UserDetail;

public class UserRepoImpl implements UserRepo{
	Map<Long,UserModel> users;
	IdGeneratorInterface generator;
	
	public UserRepoImpl(String idGeneration){
		generator = IdGeneratorFactory.getIdGenerator(idGeneration);
		users = new ConcurrentHashMap<Long,UserModel>();
	}
	
	
	
	@Override
	public Long insertUser(UserDetail user) {
		Long id = generator.generateId();
		users.put(id, new UserModel(Long.valueOf(id),user));
		return id;
	}

}
