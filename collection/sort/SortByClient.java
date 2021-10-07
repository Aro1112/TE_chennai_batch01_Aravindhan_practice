package com.te.collection.sort;

import java.util.Comparator;

import com.te.collection.set.EmplTreeSet;

public class SortByClient implements Comparator<EmplTreeSet>{

	@Override
	public int compare(EmplTreeSet o1, EmplTreeSet o2) {
		
		return o1.getClient().compareTo(o2.getClient());
	}

}
