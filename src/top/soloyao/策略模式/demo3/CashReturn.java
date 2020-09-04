package top.soloyao.策略模式.demo3;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashReturn.java
 * @Description: 返利收费子类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午9:21:49
 */
public class CashReturn extends CashSuper {
	private double moneyCondition = 0;
	private double moneyReturn = 0;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
