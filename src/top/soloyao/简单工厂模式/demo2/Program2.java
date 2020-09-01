package top.soloyao.简单工厂模式.demo2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数字A：");
			String strNumberA = sc.nextLine();
			System.out.println("请选择运算符号（+、-、*、/、）：");
			String strOperate = sc.nextLine();
			System.out.println("请输入数字B：");
			String strNumberB = sc.nextLine();
			String strResult = "";
			switch (strOperate) {
			case "+":
				strResult = String.valueOf(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
				break;
			case "-":
				strResult = String.valueOf(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
				break;
			case "*":
				strResult = String.valueOf(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
				break;
			case "/":
				if (!"0".equals(strNumberB)) {
					strResult = String.valueOf(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
				} else {
					strResult = "除数不能为0";
				}
				break;
			}
			System.out.println("结果是：" + strResult);
		} catch (Exception e) {
			System.out.println("您的输入有错：" + e.getMessage());
		}
	}
}
