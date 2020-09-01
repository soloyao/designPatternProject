package top.soloyao.简单工厂模式.demo4;

public class Client {
	public static void main(String[] args) throws Exception {
		Operation oper = null;
		oper = OperationFactory.createOperate("/");
		oper.setNumberA(69);
		oper.setNumberB(23);
		double result = oper.getResult();
		System.out.println("结果是：" + result);
	}
}
