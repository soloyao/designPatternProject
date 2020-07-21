package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashContext.java
 * @Description: 收费上下文
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:54:28
 */
public class CashContext {

	/**
	 * 收费策略对象
	 */
	CashSuper cashSuper;
	
	/**
	 * 初始化时，传入具体的收费策略对象
	 * @param cashSuper
	 */
	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	
	/**
	 * 初始化时，传入对应的字符串
	 * @param type
	 */
	public CashContext(String type) {
		switch (type) {
		case "正常收费":
			cashSuper = new CashNormal();
			break;
		case "满300返100":
			cashSuper = new CashReturn("300", "100");
			break;
		case "打8折":
			cashSuper = new CashRebate("0.8");
			break;
		}
	}
	
	/**
	 * 收费上下文接口：根据具体的收费策略对象，返回其计算结果
	 * @param money
	 * @return
	 */
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}
	
}
