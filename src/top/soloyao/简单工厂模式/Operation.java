package top.soloyao.简单工厂模式;

import java.util.Scanner;

public class Operation {
	public static double getResult(double numberA, double numberB, String operate) throws Exception {
		double result = 0;
		switch (operate) {
		case "+":
			result = numberA + numberB;
			break;
		case "-":
			result = numberA - numberB;
			break;
		case "*":
			result = numberA * numberB;
			break;
		case "/":
			if (numberB == 0) {
				throw new Exception("除数不能为0");
			}
			result = numberA / numberB;
			break;
		}
		return result;
	}
	
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

