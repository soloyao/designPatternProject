package top.soloyao.策略模式.demo4;

public class Client {
	public static void main(String[] args) {
		Context context; 
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
