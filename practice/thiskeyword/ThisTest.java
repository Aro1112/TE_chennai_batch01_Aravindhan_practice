package com.te.practice.thiskeyword;

public class ThisTest {

	int ivalue;
	char dvalue='e';
	
	ThisTest(int ivalue,char dvalue) {
		super();
		System.out.println(ivalue +" "+this.ivalue); 
		this.ivalue=ivalue;
		this.dvalue=dvalue;
		System.out.println(dvalue+" "+this.dvalue); 
	}

	public static void main(String[] args) {
		
		ThisTest test = new ThisTest(25, 'd');
		System.out.println(test.ivalue +" "+test.dvalue);
		ThisTest test2 = new ThisTest(13, 'm');
		System.out.println(test2.ivalue +" "+test2.dvalue);
	}
	
}
