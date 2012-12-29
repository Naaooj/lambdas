package fr.free.naoj.lambdas.impl;

import java.util.concurrent.Callable;

import fr.free.naoj.lambdas.RepertoryFactory;

public class RepertoryFactoryImpl implements RepertoryFactory {
	
	public void createAndInitARepertory() {
		System.out.println("Initializing a new repertory");
		
		RepertoryFactory lambdaAsAFactory = () -> { System.out.println("Calling method createAndInitARepertory() from lambda"); };
		
		lambdaAsAFactory.createAndInitARepertory();
	}
}
