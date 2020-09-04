package top.soloyao.策略模式.demo3;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashFactory.java
 * @Description: 现金收费工厂类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年9月2日 上午9:26:06
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type) {
		CashSuper cashSuper = null;
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
		return cashSuper;
	}
}
