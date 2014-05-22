package org.euler.project;

import java.io.*;

public class MainClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Choice from 1-10");
		int c = Integer.parseInt(br.readLine());
		switch (c) {
		case 1:
			Problem1 obj1 = new Problem1();
			System.out.println(obj1.calc());
			break;

		case 2:
			Problem2 obj2 = new Problem2();
			System.out.println(obj2.calc());
			break;

		case 3:
			Problem3 obj3 = new Problem3();
			System.out.println(obj3.calc());
			break;

		case 4:
			Problem4 obj4 = new Problem4();
			System.out.println(obj4.calc());
			break;

		case 5:
			Problem5 obj5 = new Problem5();
			System.out.println(obj5.calc());
			break;

		case 6:
			Problem6 obj6 = new Problem6();
			System.out.println(obj6.calc());
			break;

		case 7:
			Problem7 obj7 = new Problem7();
			System.out.println(obj7.calc());
			break;

		case 8:
			Problem8 obj8 = new Problem8();
			obj8.calc();
			break;

		case 9:
			Problem9 obj9 = new Problem9();
			obj9.calc();
			break;

		case 10:
			Problem10 obj10 = new Problem10();
			System.out.println(obj10.calc());
			break;

		}
	}
}
