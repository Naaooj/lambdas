package fr.free.naoj.lambdas;

import java.util.NoSuchElementException;
import java.util.Scanner;

import fr.free.naoj.lambdas.impl.Repertory;
import fr.free.naoj.lambdas.impl.RepertoryFactoryImpl;

public class ClosuresApplication {
	
	public static void main(String[] args) {
		Repertory repertory = new RepertoryFactoryImpl().createAndInitARepertory();
		
		System.out.println("Names found in repertory : ");
		for (String name : repertory) {
			System.out.println(name);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which one do you want ?");
		
		String searchedName = scanner.next();
		try {
			searchedName = repertory.getEntryForName(searchedName);
			System.out.println("Entry named [" + searchedName + "] has been selected");
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}
