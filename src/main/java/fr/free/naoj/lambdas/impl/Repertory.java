package fr.free.naoj.lambdas.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Repertory implements Iterable<Entry> {

	private List<Entry> entries;

	public List<Entry> getEntries() {
		if (entries == null) {
			entries = new ArrayList<Entry>();
		}
		return entries;
	}

	public Iterator<Entry> iterator() {
		return getEntries().iterator();
	}
	
	public String getEntryForName(String searchedName) throws NoSuchElementException {
		return getEntries()
				.stream()
				.filter(e -> e.getName().toLowerCase().equals(searchedName != null ? searchedName.toLowerCase() : null))
				.findFirst().get().getName();
	}
	
	public List<Entry> getEntriesForGroup(final int groupId) {
		List<Entry> entries = new ArrayList<>();
		
		for (Entry entry : getEntries()) {
			if (entry.getGroupId() == groupId) {
				entries.add(entry);
			}
		}
		
		return entries;
	}
}
