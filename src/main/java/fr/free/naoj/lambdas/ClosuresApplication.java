package fr.free.naoj.lambdas;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import fr.free.naoj.lambdas.impl.Entry;
import fr.free.naoj.lambdas.impl.Repertory;
import fr.free.naoj.lambdas.impl.RepertoryFactoryImpl;

public class ClosuresApplication {
	
	public static void main(String[] args) {
		Repertory repertory = new RepertoryFactoryImpl().createAndInitARepertory();
		
		System.out.println("Names found in repertory : ");
		displayEntries(repertory.getEntries());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which group do you want ?");
		
		try {
			int searchedGroup = scanner.nextInt();
			
			List<Entry> searchedEntries = repertory.getEntriesForGroup(searchedGroup);
			
			System.out.println("Entries present in group [" + searchedGroup + "]");
			displayEntries(searchedEntries);
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
