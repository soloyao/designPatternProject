package top.soloyao.简单工厂模式;


public class OperationFactory {
	public static Operation1 createOperation(String operate) {
		Operation1 oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
	
	public static void main(String[] args) {
		Operation1 oper;
		oper = OperationFactory.createOperation("*");
		oper.setNumberA(20);
		oper.setNumberB(0);
		double result = 0;
		try {
			result = oper.getResult();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("您的输入有错：" + e.getMessage());
		}
	}
}
