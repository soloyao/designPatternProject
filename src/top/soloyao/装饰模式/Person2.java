package top.soloyao.装饰模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: Person2.java
 * @Description: 小菜扮靓2.0
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月21日 下午2:13:07
 */
public class Person2 {

	private String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("装扮的" + name);
	}
	
	public static void main(String[] args) {
		Person2 xc = new Person2("小菜");
		System.out.println("第一种装扮：");
		Finery dtx = new TShirts();
		Finery kk = new BigTrouser();
		Finery pqx = new Sneakers();
		dtx.show();
		kk.show();
		pqx.show();
		xc.show();
		
		System.out.println("第二种装扮：");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();
		xz.show();
		ld.show();
		px.show();
		xc.show();
	}
	
}
