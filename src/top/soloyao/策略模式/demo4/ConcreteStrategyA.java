package top.soloyao.策略模式.demo4;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: ConcreteStrategy.java
 * @Description: 具体算法A
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午10:20:07
 */
public class ConcreteStrategyA extends Strategy {

	//算法A实现方法
	@Override
	public void algorithmInterface() {
		System.out.println("算法A实现");
	}

}
