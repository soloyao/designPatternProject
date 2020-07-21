package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashClient.java
 * @Description: 商场收银软件（未使用设计模式）
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午3:43:56
 */
public class CashClient {
	
	/**
	 * 单价
	 */
	private static final double txtPrice = 200;
	
	/**
	 * 数量
	 */
	private static final int txtNum = 10;
	
	/**
	 * 总计
	 */
	private static double total = 0;
	
	/**
	 * 优惠选择
	 */
	private static String[] types = {"正常收费", "打八折", "打七折", "打五折"};
	
	private static int type = 1;
	
	public static void main(String[] args) {
		//每个商品的单价*数量后的合计
//		double totalPrices = txtPrice * txtNum;
		double totalPrices = 0;
		switch (type) {
		case 0:
			totalPrices = txtPrice * txtNum;
			break;
		case 1:
			totalPrices = txtPrice * txtNum * 0.8;
			break;
		case 2:
			totalPrices = txtPrice * txtNum * 0.7;
			break;
		case 3:
			totalPrices = txtPrice * txtNum * 0.5;
			break;
		}
		//将每个商品合计计入总计
		total += totalPrices;
		System.out.println("单价：" + txtPrice + "\n数量：" + txtNum + "\n" + types[type] + "\n合计：" + totalPrices);
		System.out.println("总计：" + total);
	}
	
}
