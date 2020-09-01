package top.soloyao.简单工厂模式.demo1;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字A：");
		String A = sc.nextLine();
		System.out.println("请选择运算符号（+、-、*、/）：");
		String B = sc.nextLine();
		System.out.println("请输入数字B：");
		String C = sc.nextLine();
		String D = "";
		if ("+".equals(B)) {
			D =  String.valueOf(Double.parseDouble(A) + Double.parseDouble(C));
		}
		if ("-".equals(B)) {
			D =  String.valueOf(Double.parseDouble(A) - Double.parseDouble(C));
		}
		if ("*".equals(B)) {
			D =  String.valueOf(Double.parseDouble(A) * Double.parseDouble(C));
		}
		if ("/".equals(B)) {
			D =  String.valueOf(Double.parseDouble(A) / Double.parseDouble(C));
		}
		System.out.println("结果是：" + D);
	}
}
