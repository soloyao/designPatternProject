package top.soloyao.策略模式.demo4;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: ConcreteStrategyB.java
 * @Description: 具体算法B
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午10:29:07
 */
public class ConcreteStrategyB extends Strategy {

	//算法B实现方法
	@Override
	public void algorithmInterface() {
		System.out.println("算法B实现");
	}

}
