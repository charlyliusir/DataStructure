package com.liuchaolong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new 在堆空间申请内存
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(11);
		lists.add(22);
		lists.add(33);
		lists.add(2, 108);
		lists.remove(1);
		Assert.test(lists.get(1) == 108);
		System.out.println(lists);
		
		for (int i = 0; i < 20; i++) {
			lists.add(i);
		}
		
		System.out.println(lists);
		
	}

}
