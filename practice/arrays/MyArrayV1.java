package com.te.practice.arrays;

public class MyArrayV1 {
	private int [] arr;
	private int position = 0;
	private final int DEFAULT_SIZE =5;
	
		public MyArrayV1 ( ) {
			arr = new int[DEFAULT_SIZE];
		}
		public MyArrayV1(int intsize) {
			arr = new int[intsize];
		}
		public boolean add(int element) {
			if(position < arr.length) {
				arr[position++] = element;
			} else {
				// calculating new size
				int newsize = arr.length + (arr.length/2);
				int [] arr2 = new int[newsize];
				
				//copying the old array to new array
				for (int i = 0; i < arr.length; i++) {
					arr2[i]= arr[i];
				}
				arr = arr2;
				arr[position++]=element;
			}
			return true;
		}
		public int get(int index) {
			return arr[index];
		}
		public int size() {
			return arr.length;
		}
}
