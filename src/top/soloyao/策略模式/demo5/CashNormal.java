package top.soloyao.策略模式.demo5;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashNormal.java
 * @Description: 正常收费子类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月1日 下午7:56:50
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
