package top.soloyao.策略模式.demo5;

import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: Client.java
 * @Description: 客户端
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午9:30:35
 */
public class Client {
	private static double total = 0;
	private static String[] types = new String[] {"正常收费", "打8折", "满300返100"};
	private static int selectedIndex = 2;
	
	/**
	 * 策略与简单工厂结合客户端
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		boolean flag = true;
		CashContext cashContext = new CashContext(types[selectedIndex]);
		while (flag) {
			System.out.println("请输入商品信息：");
			System.out.println("请输入单价：");
			String price = sc.nextLine();
			System.out.println("请输入购买数量：");
			String number = sc.nextLine();
			double totalPrices = 0;
			totalPrices = cashContext.getResult(Double.parseDouble(price) * Double.parseDouble(number));
			System.out.println("单价：" + price + " 数量：" + number + " " 
					+ types[selectedIndex] + " 合计：" + totalPrices);
			total += totalPrices;
			System.out.println("是否退出？Y为退出，N为继续录入");
			String outFlag = sc.nextLine();
			if ("Y".equals(outFlag)) {
				flag = false;
			} else {
				flag = true;
			}
		}
		System.out.println("总计：" + total);
	}
	
	/**
	 * 简单工厂模式客户端
	 * @param args
	 */
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		boolean flag = true;
		CashContext cashContext = null;
		while (flag) {
			System.out.println("请输入商品信息：");
			System.out.println("请输入单价：");
			String price = sc.nextLine();
			System.out.println("请输入购买数量：");
			String number = sc.nextLine();
			switch (selectedIndex) {
			case 0:
				cashContext = new CashContext(new CashNormal());
				break;
			case 1:
				cashContext = new CashContext(new CashRebate("0.8"));
				break;
			case 2:
				cashContext = new CashContext(new CashReturn("300", "100"));
				break;
			}
			double totalPrices = 0;
			totalPrices = cashContext.getResult(Double.parseDouble(price) * Double.parseDouble(number));
			System.out.println("单价：" + price + " 数量：" + number + " " 
					+ types[selectedIndex] + " 合计：" + totalPrices);
			total += totalPrices;
			System.out.println("是否退出？Y为退出，N为继续录入");
			String outFlag = sc.nextLine();
			if ("Y".equals(outFlag)) {
				flag = false;
			} else {
				flag = true;
			}
		}
		System.out.println("总计：" + total);
	}
}
