package top.soloyao.策略模式.demo2;

import java.util.Scanner;

public class Client {
	private static double total = 0;
	private static String[] types = new String[] {"正常收费", "打八折", "打七折", "打五折"};
	private static int selectedIndex = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("请输入商品信息：");
			System.out.println("请输入单价：");
			String price = sc.nextLine();
			System.out.println("请输入购买数量：");
			String number = sc.nextLine();
			double totalPrices = 0;
			switch (selectedIndex) {
			case 0:
				totalPrices = Double.parseDouble(price) * Double.parseDouble(number);
				break;
			case 1:
				totalPrices = Double.parseDouble(price) * Double.parseDouble(number) * 0.8;
				break;
			case 2:
				totalPrices = Double.parseDouble(price) * Double.parseDouble(number) * 0.7;
				break;
			case 3:
				totalPrices = Double.parseDouble(price) * Double.parseDouble(number) * 0.5;
				break;
			}
			System.out.println("单价：" + price + " 数量：" + number + " 合计：" + totalPrices);
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
