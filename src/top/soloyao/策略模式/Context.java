package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: Context.java
 * @Description: 上下文
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:49:57
 */
public class Context {
	
	/**
	 * 策略对象
	 */
	Strategy strategy;
	
	/**
	 * 初始化时，传入具体的策略对象
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 上下文接口：根据具体的策略对象，调用其算法的方法
	 */
	public void contextInterface() {
		strategy.algorithmInterface();
	}

}
