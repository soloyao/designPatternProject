package top.soloyao.装饰模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: Decorator.java
 * @Description: 装饰抽象类，继承了Component，从外类来扩展Component类的功能，但对于Component来说，是无需知道Decorator的存在的
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月21日 下午6:36:49
 */
public class Decorator extends Component {

	protected Component component;
	
	/**
	 * 设置Component
	 * @param component
	 */
	public void setComponent(Component component) {
		this.component = component;
	}

	/**
	 * 重写operation方法，实际执行的是Component的operation方法
	 */
	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}
	}
	
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();
		
		/**
		 * 装饰的方法是：首先用ConcreteComponent实例化对象c，然后用ConcreteDecoratorA的实例化对象d1来包装c，
		 * 再用ConcreteDecoratorB的对象d2包装d1，最终执行d2的operation方法
		 */
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}
	
}
