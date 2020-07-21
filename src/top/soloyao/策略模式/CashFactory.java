package top.soloyao.策略模式;

/**
 * Copyright: Copyright (c) 2020 Mengyao Zeng
 *
 * @ClassName: CashFactory.java
 * @Description: 现金收费工厂类
 * 
 * @version: v1.0.0
 * @author: Mengyao Zeng
 * @email: 343722243@qq.com
 * @date: 2020年7月20日 下午4:28:56
 */
public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;
		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;
		case "满300返100":
			cs = new CashReturn("300", "100");
			break;
		case "打8折":
			cs = new CashRebate("0.8");
			break;
		}
		return cs;
	}
	
}
