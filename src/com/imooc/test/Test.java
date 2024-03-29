package com.imooc.test;

import com.imooc.singleton.SingletonOne;
import com.imooc.singleton.SingletonTwo;

public class Test {

	public static void main(String[] args) {
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);
		System.out.println("-----------------------");
		SingletonTwo one1 = SingletonTwo.getInstance();
		SingletonTwo two1 = SingletonTwo.getInstance();
		System.out.println(one);
		System.out.println(two);
	}
}
