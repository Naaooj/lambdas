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
		return getNames()
				.stream()
				.filter(name -> name.toLowerCase().equals(searchedName != null ? searchedName.toLowerCase() : null))
				.findFirst().get();
	}
}
