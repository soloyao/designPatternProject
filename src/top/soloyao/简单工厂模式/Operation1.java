package top.soloyao.简单工厂模式;

public class Operation1 {
	private double numberA = 0;
	private double numberB = 0;
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	public double getResult() throws Exception {
		double result = 0;
		return result;
	}
}

class OperationAdd extends Operation1 {
	@Override
	public double getResult() {
		double result = 0;
		result = getNumberA() + getNumberB();
		return result;
	}
}

class OperationSub extends Operation1 {
	@Override
	public double getResult() {
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}
}

class OperationMul extends Operation1 {
	@Override
	public double getResult() {
		double result = 0;
		result = getNumberA() * getNumberB();
		return result;
	}
}

class OperationDiv extends Operation1 {
	@Override
	public double getResult() throws Exception {
		double result = 0;
		if (getNumberB() == 0) {
			throw new Exception("除数不能为0");
		}
		result = getNumberA() / getNumberB();
		return result;
	}
}
