package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashRebate.java
 * @Description: 打折收费子类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:23:19
 */
public class CashRebate extends CashSuper {

	/**
	 * 折扣率
	 */
	private double moneyRebate = 1;
	
	/**
	 * 初始化时，必须要输入折扣率，打八折，就是0.8
	 * @param moneyRebate
	 */
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	
	/**
	 * 打折收费计算方式：返回原价乘以折扣率
	 */
	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
