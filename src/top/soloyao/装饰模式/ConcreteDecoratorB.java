package top.soloyao.装饰模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: ConcreteDecoratorA.java
 * @Description: 就是具体的装饰对象，起到给Component添加职责的功能
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月21日 下午6:48:12
 */
public class ConcreteDecoratorB extends Decorator {

	/**
	 * 首先运行原Component的operation方法，再执行本类的功能，如addedState，相当于对原Component进行了装饰
	 */
	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	
	/**
	 * 本类独有的方法，以区别于ConcreteDecoratorB
	 */
	private void addedBehavior() {
		
	}
	
}
