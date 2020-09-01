package top.soloyao.简单工厂模式.demo4;

public class OperationMul extends Operation {
	@Override
	public double getResult() throws Exception {
		double result = 0;
		result = getNumberA() * getNumberB();
		return result;
	}
}
