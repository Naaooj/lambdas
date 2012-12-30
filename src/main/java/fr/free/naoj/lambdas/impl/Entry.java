package fr.free.naoj.lambdas.impl;

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
}
