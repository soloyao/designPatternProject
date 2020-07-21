package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashNormal.java
 * @Description: 正常收费子类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:22:22
 */
public class CashNormal extends CashSuper {

	/**
	 * 正常收费计算方式：原价返回
	 */
	@Override
	public double acceptCash(double money) {
		return money;
	}
	
}
