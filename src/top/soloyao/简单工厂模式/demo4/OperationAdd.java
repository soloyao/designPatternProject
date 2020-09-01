package top.soloyao.简单工厂模式.demo4;

public class OperationAdd extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		result = getNumberA() + getNumberB();
		return result;
	}
}
