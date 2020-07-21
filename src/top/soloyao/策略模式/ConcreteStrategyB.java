package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: ConcreteStrategy.java
 * @Description: 具体算法B
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:48:37
 */
public class ConcreteStrategyB extends Strategy {

	/**
	 * 算法B实现方法
	 */
	@Override
	public void algorithmInterface() {
		System.out.println("算法B实现");
	}

}
