package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashClient.java
 * @Description: 商场收银软件（简单工厂模式）
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午3:43:56
 */
public class CashClient1 {
	
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
	private static String[] types = {"正常收费", "满300返100", "打8折"};
	
	private static int type = 2;
	
	public static void main(String[] args) {
		CashSuper cashSuper = CashFactory.createCashAccept(types[type]);
		double totalPrices = 0;
		totalPrices = cashSuper.acceptCash(txtPrice * txtNum);
		total += totalPrices;
		System.out.println("单价：" + txtPrice + "\n数量：" + txtNum + "\n" + types[type] + "\n合计：" + totalPrices);
		System.out.println("总计：" + total);
	}
	
}
