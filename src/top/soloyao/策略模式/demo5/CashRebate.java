package top.soloyao.策略模式.demo5;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashRebate.java
 * @Description: 打折收费子类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月1日 下午7:57:12
 */
public class CashRebate extends CashSuper {
	private double moneyRebate = 1d;
	
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
