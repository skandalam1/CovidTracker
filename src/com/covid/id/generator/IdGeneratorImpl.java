package com.covid.id.generator;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGeneratorImpl implements IdGeneratorInterface{


	AtomicInteger id = null;
	
	public IdGeneratorImpl(){
		this.id = new AtomicInteger();
	}
	
	@Override
	public Long generateId() {
		return Long.valueOf(id.incrementAndGet());
	}
}
