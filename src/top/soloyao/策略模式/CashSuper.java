package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashSuper.java
 * @Description: 现金收费抽象类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:20:29
 */
public abstract class CashSuper {

	/**
	 * 现金收取超类的抽象方法，收取现金，参数为原价，返回为当前价
	 * @param money
	 * @return
	 */
	public abstract double acceptCash(double money);
	
}
