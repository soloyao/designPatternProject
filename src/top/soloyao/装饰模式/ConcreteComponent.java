package top.soloyao.装饰模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: ConcreteComponent.java
 * @Description: 是定义了一个具体的对象，也可以给这个对象添加一些职责
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月21日 下午6:35:22
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}

}
