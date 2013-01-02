package fr.free.naoj.lambdas.impl;

import java.util.Comparator;
import java.util.function.Function;

public class Entry {

	public static final Function<Entry, Integer> GROUP_ID_MAPPER;
	
	static {
		GROUP_ID_MAPPER = Entry::getGroupId;
	}
	
	private int groupId;
	private String name;
	
	public Entry(int groupId, String name) {
		this.groupId = groupId;
		this.name = name;
	}

	public int getGroupId() {
		return groupId;
	}

	public String getName() {
		return name == null ? "" : name;
	}

	@Override
	public String toString() {
		return groupId + ":" + name;
	}
	
	public static int compareByGroupId(Entry firstEntry, Entry secondEntry) {
		int comparison = 0;
		
		if (firstEntry.getGroupId() > secondEntry.getGroupId()) {
			comparison = 1;
		} else if (firstEntry.getGroupId() < secondEntry.getGroupId()) {
			comparison = -1;
		}
		
		return comparison;
	}
	
	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<T, U> function) {		
		// Function is a lambda that takes an Entry as parameter (T)
		// and which returns a certain property (U) of this parameter
		
		// the returned object is simply a Comparator of Entry
		// objects written again with a lambda expression
		// public interface Comparator<Entry>() {
		// 		int compare(Entry x, Entry y);			
		// }
	    return (x, y) -> function.apply(x).compareTo(function.apply(y));
	}
}
