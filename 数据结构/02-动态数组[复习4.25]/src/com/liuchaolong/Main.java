package com.liuchaolong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(11);
		lists.add(22);
		lists.add(33);
		
		lists.add(3, 77);
		
		lists.set(2, 55);
		
		Asserts.test(lists.contains(77) == true);
		
		System.out.println(lists);
    
	}

}
