package top.soloyao.装饰模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: TShirts.java
 * @Description: 服饰子类-领带类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月21日 下午2:15:40
 */
public class Tie extends Finery {

	@Override
	public void show() {
		System.out.println("领带");
	}

}
