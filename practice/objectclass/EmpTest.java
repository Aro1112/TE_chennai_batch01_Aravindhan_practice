package com.te.practice.objectclass;

public class EmpTest {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args);

		Employee emp1 = new Employee();
		emp1.setEid(10);
		emp1.setEname("Aravind");
		emp1.setRole("Full Stack Developer");
		emp1.setSal(50000);

		System.out.println(emp1.toString()); // toString is not mandatory

		Employee emp2 = new Employee();
		emp2.setEid(20);
		emp2.setEname("Dinesh");
		emp2.setRole("Frontend developer");
		emp2.setSal(40000);

		Employee emp3 = new Employee();
		emp3.setEid(30);
		emp3.setEname("Ganesh");
		emp3.setRole("Backend developer");
		emp3.setSal(30000);

		Employee emp4 = new Employee();
		emp4.setEid(40);
		emp4.setEname("Raj");
		emp4.setRole("Sr.frontend developer");
		emp4.setSal(80000);

		Object[] empl = new Object[4];
		empl[0] = emp1;
		empl[1] = emp2;
		empl[2] = emp3;
		empl[3] = emp4;

		for (Object emp : empl) {
			Employee emply = (Employee) emp;
			System.out.println(emply.getEid());
			System.out.println(emply.getEname());
			
		}

		Employee[] e1 = new Employee[4];
		e1[0] = emp1;
		e1[1] = emp2;
		e1[2] = emp3;
		e1[3] = emp4;

		for (Employee e2 : e1) {
			System.out.println(e2.getEid());
			System.out.println(e2.getEname());

		}

	}

}
