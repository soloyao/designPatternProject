package top.soloyao.策略模式.demo4;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: Context.java
 * @Description: 上下文
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午10:33:17
 */
public class Context {
	private Strategy strategy;

	//初始化时，传入具体的策略对象
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	//上下文接口，根据具体的策略对象，调用其算法的方法
	public void contextInterface() {
		strategy.algorithmInterface();
	}
}
