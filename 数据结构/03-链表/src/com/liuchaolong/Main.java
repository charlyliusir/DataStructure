package com.liuchaolong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList<Integer> lists = new LinkList<>();
		
		lists.add(11);
		lists.add(22);
		lists.add(33);
		
		lists.remove(0);
		lists.add(2, 100);
//		lists.add(55);
		lists.set(2, 88);
		
		Asserts.test(lists.contains(77) == false);
		
		System.out.println(lists);

	}

}
