package fr.free.naoj.lambdas.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Streams;

import fr.free.naoj.lambdas.RepertoryFactory;

public class RepertoryFactoryImpl implements RepertoryFactory {
	
	private int groupId = 0; 
	
	public Repertory createAndInitARepertory() {
		System.out.println("Initializing a new repertory");
		
		Repertory repertory = new Repertory();

		List<Entry> entries = Arrays.asList("Sophitia", "Nightmare", "Yoshimistu", "Ivy", "Xianghua", "Taki")
			.stream()
			.map((e) -> new Entry(getRandomGroupId(), e))
			.into(new ArrayList<Entry>());
		
		repertory.getEntries().addAll(entries);
		
		return repertory;
	}
	
	private int getRandomGroupId() {
		return (groupId++) % 3;
	}
}
