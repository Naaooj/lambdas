package fr.free.naoj.lambdas.impl;

import java.util.Arrays;

import fr.free.naoj.lambdas.RepertoryFactory;

public class RepertoryFactoryImpl implements RepertoryFactory {
	
	public Repertory createAndInitARepertory() {
		System.out.println("Initializing a new repertory");
		
		Repertory repertory = new Repertory();
		repertory.getNames().addAll(Arrays.asList("Sophitia", "Nightmare", "Yoshimistu", "Ivy", "Xianghua", "Taki"));
		
		return repertory;
	}
}
