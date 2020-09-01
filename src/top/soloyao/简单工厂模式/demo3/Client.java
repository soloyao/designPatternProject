package top.soloyao.简单工厂模式.demo3;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数字A：");
			String strNumberA = sc.nextLine();
			System.out.println("请选择运算符号（+、-、*、/）：");
			String strOperate = sc.nextLine();
			System.out.println("请输入数字B：");
			String strNumberB = sc.nextLine();
			String strResult = "";
			strResult = String.valueOf(Operation.getResult(Double.parseDouble(strNumberA), Double.parseDouble(strNumberB), strOperate));
			System.out.println("结果是：" + strResult);
		} catch (Exception e) {
			System.out.println("您的输入有错：" + e.getMessage());
		}
	}
}
