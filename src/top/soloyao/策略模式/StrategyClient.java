package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: StrategyClient.java
 * @Description: 策略模式客户端
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:56:43
 */
public class StrategyClient {
	
	public static void main(String[] args) {
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
	
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
	
}
