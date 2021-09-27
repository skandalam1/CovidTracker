package com.covid.id.generator;

public class IdGeneratorFactory {

	public static IdGeneratorInterface getIdGenerator(String impl) {
		if(impl.equalsIgnoreCase(Constants.NATIVE)) {
			return new IdGeneratorImpl();
		}
		return null;
	}
}
