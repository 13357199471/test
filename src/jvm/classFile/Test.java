package jvm.classFile;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {
	public static void test1() {
		System.out.println("Welocome to Java");

	}

	public static void test2() {
		int a = 21, b = 5;
		double c = 5.0, d = 5.2;
		System.out.println("a/b=" + a / b + "\ta%b" + a % b + "\ta/c=" + a / c + "\ta%d=" + a % d);
	}

	public static void test3() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if (a > b)
			System.out.println(a);
		else if (a < b)
			System.out.println(b);
		else
			System.out.println("equal");
		System.out.println(a > b ? a : b);
	}

	public static void test4() {
		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			if (n == 1)
				break;
			if (n < 0 || n > 1000) {
				System.out.println("erry");
				continue;
			}
			if (n % 9 == 0)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

	private static int area(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		Square square=new Square();
		square.setLength(a);
		square.setWidth(b);
		System.out.println(square.toString());
	}
}
