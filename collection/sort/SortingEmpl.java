package com.te.collection.sort;

import java.util.Scanner;
import java.util.TreeSet;

import com.te.collection.set.EmplTreeSet;

public class SortingEmpl {

	public static void main(String[] args) {

		System.out.println("sorting types");
		System.out.println(" 1.Id \n 2.Name \n 3.salary \n 4.client");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your option");
		int optn = scanner.nextInt();
		scanner.close();

		TreeSet<EmplTreeSet> set = null;

		switch (optn) {
		case 1:
			set = new TreeSet<EmplTreeSet>();
			break;
		case 2:
			set = new TreeSet<EmplTreeSet>(new SortByName());
			break;
		case 3:
			set = new TreeSet<EmplTreeSet>(new SortBySalary());
			break;
		case 4:
			set = new TreeSet<EmplTreeSet>(new SortByClient());
			break;
		default:
			System.out.println("wrong optin");
			break;
		}

		if (set != null) {

			EmplTreeSet emp = new EmplTreeSet(1, "Aravind", "FullStack", 100000.00, "google");
			EmplTreeSet emp1 = new EmplTreeSet(2, "Arun", "Developer", 40000.00, "hp");
			EmplTreeSet emp2 = new EmplTreeSet(3, "Dinesh", "Sr.Developer", 90000.00, "Facebook");

			set.add(emp);
			set.add(emp1);
			set.add(emp2);

			for (EmplTreeSet emplTreeSet : set) {
				System.out.println(emplTreeSet);
			}
		}

	}

}
