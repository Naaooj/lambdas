package fr.free.naoj.lambdas.impl;

import java.util.Comparator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class Entry {

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
	
	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Mapper<T, U> mapper) {		
		// mapper is a lambda that takes an Entry as parameter (T)
		// and which returns a certain property (U) of this parameter
		
		// the returned object is simply a Comparator of Entry
		// objects written again with a lambda expression
		// public interface Comparator<Entry>() {
		// 		int compare(Entry x, Entry y);			
		// }
	    return (x, y) -> mapper.map(x).compareTo(mapper.map(y));
	}
}
