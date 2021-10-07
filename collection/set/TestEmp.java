package com.te.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestEmp {

	public static void main(String[] args) {
		
		EmplTreeSet emp = new EmplTreeSet(1,"Aravind", "FullStack", 100000.00, "google");
		EmplTreeSet emp1 = new EmplTreeSet(2,"Arun", "Developer", 40000.00, "hp");
		EmplTreeSet emp2 = new EmplTreeSet(3,"Dinesh", "Sr.Developer", 900000.00, "Facebook");
		
		TreeSet<EmplTreeSet> emplTreeSets = new TreeSet<EmplTreeSet>();
		emplTreeSets.add(emp);
		emplTreeSets.add(emp1);	
		emplTreeSets.add(emp2);	
		
		Iterator<EmplTreeSet> e =emplTreeSets.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
			
		}
	}
}
