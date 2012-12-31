package fr.free.naoj.lambdas;

import java.util.Collections;
import java.util.Comparator;
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
			Collections.sort(repertory.getEntries(), new Comparator<Entry>() {
				public int compare(Entry o1, Entry o2) {
					int comparison = 0;
					if (o1.getGroupId() > o2.getGroupId()) {
						comparison = 1;
					} else if (o1.getGroupId() < o2.getGroupId()) {
						comparison = -1;
					}
					return comparison;
				}
			});
			
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
