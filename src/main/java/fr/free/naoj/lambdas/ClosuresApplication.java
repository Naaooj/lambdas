package fr.free.naoj.lambdas;

import static fr.free.naoj.lambdas.impl.Entry.GROUP_ID_MAPPER;
import static fr.free.naoj.lambdas.impl.Entry.comparing;

import java.util.List;
import java.util.NoSuchElementException;

import fr.free.naoj.lambdas.impl.Entry;
import fr.free.naoj.lambdas.impl.Repertory;
import fr.free.naoj.lambdas.impl.RepertoryFactoryImpl;

public class ClosuresApplication {
	
	public static void main(String[] args) {
		Repertory repertory = new RepertoryFactoryImpl().createAndInitARepertory();
		
		System.out.println("Names found in repertory : ");
		displayEntries(repertory.getEntries());
		
		try {			
			repertory.getEntries().sort(comparing(GROUP_ID_MAPPER));
			
			System.out.println("Entries sorted by group");
			displayEntries(repertory.getEntries());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void displayEntries(List<Entry> entries) {
		for (Entry entry : entries) {
			System.out.println(entry);
		}
	}
}
