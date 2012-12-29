package fr.free.naoj.lambdas.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Repertory implements Iterable<String> {

	private List<String> names;

	public List<String> getNames() {
		if (names == null) {
			names = new ArrayList<String>();
		}
		return names;
	}

	public Iterator<String> iterator() {
		return getNames().iterator();
	}
	
	public String getEntryForName(String searchedName) throws NoSuchElementException {
		if (searchedName != null) {
			for (String name : names) {
				if (name.toLowerCase().equals(searchedName.toLowerCase())) {
					return name;
				}
			}
		}
		
		throw new NoSuchElementException("Entry named [" + searchedName + "] not found");
	}
}
