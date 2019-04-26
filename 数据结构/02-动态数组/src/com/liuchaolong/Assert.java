package com.liuchaolong;

public class Assert {
	public static void test(boolean value) {
		try {
			if (!value) throw new Exception("测试未通过");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
