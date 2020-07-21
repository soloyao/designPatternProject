package top.soloyao.装饰模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: Person1.java
 * @Description: 小菜扮靓1.0
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月21日 下午2:12:47
 */
public class Person1 {

	private String name;
	
	public Person1(String name) {
		this.name = name;
	}
	
	public void wearTShirts() {
		System.out.println("大T恤");
	}
	
	public void wearBigTrouser() {
		System.out.println("垮裤");
	}
	
	public void wearSneakers() {
		System.out.println("破球鞋");
		
	}
	
	public void wearSuit() {
		System.out.println("西装");
	}
	
	public void wearTie() {
		System.out.println("领带");
	}
	
	public void wearLeatherShoes() {
		System.out.println("皮鞋");
	}
	
	public void show() {
		System.out.println("装扮的" + name);
	}
	
	public static void main(String[] args) {
		Person1 xc = new Person1("小菜");
		System.out.println("第一种装扮：");
		xc.wearTShirts();
		xc.wearBigTrouser();
		xc.wearSneakers();
		xc.show();
		
		System.out.println("第二种装扮：");
		xc.wearSuit();
		xc.wearTie();
		xc.wearLeatherShoes();
		xc.show();
		
	}
	
}
