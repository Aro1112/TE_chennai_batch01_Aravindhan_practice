package com.te.collection.sort;

import java.util.Comparator;

import com.te.collection.set.EmplTreeSet;

public class SortBySalary implements Comparator<EmplTreeSet> {

	@Override
	public int compare(EmplTreeSet o1, EmplTreeSet o2) {
		
		return (int) (o1.getSalary()-o2.getSalary());
	}

}
