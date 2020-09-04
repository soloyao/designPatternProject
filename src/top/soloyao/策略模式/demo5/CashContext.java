package top.soloyao.策略模式.demo5;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashContext.java
 * @Description: 收费上下文
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午10:51:39
 */
public class CashContext {
	private CashSuper cashSuper;

	//初始化时，传入具体的收费策略对象
	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	
	//初始化时，传入收费策略字符串
	public CashContext(String type) {
		switch (type) {
		case "正常收费":
			this.cashSuper = new CashNormal();
			break;
		case "满300返100":
			this.cashSuper = new CashReturn("300", "100");
			break;
		case "打8折":
			this.cashSuper = new CashRebate("0.8");
			break;
		}
	}
	
	//根据收费策略的不同，获得计算结果
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}
}
