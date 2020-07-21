package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashReturn.java
 * @Description: 返利收费子类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:25:28
 */
public class CashReturn extends CashSuper {

	/**
	 * 返利条件（满减的满值）
	 */
	private double moneyCondition = 0;
	
	/**
	 * 返利值（满减的减值）
	 */
	private double moneyReturn = 0;
	
	/**
	 * 初始化时必须要输入返利条件和返利值，比如满300返100，则moneyCondition为300，moneyReturn为100
	 * @param moneyCondition
	 * @param moneyReturn
	 */
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}
	
	/**
	 * 返利收费计算方式：若大于返利条件，则需要减去返利值
	 */
	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
