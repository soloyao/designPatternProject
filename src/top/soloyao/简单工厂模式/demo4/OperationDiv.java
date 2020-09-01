package top.soloyao.简单工厂模式.demo4;

public class OperationDiv extends Operation {
	@Override
	public double getResult() throws Exception{
		double result = 0;
		if (getNumberB() == 0) {
			throw new Exception("除数不能为0");
		}
		result = getNumberA() / getNumberB();
		return result;
	}
}
