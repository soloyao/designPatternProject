package top.soloyao.策略模式.demo1;

import java.util.Scanner;

public class Client {
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
			double totalPrices = Double.parseDouble(price) * Double.parseDouble(number);
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
