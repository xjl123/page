package com.njbdqn.single.componse.page;

public class BetweenConditionStrategy implements IAbstractConditionStrategy{

	public String getSQLCondition(String conds) {
		return " " + conds.replace(":", " between ").replace("-", " and ") + " ";
	}
}
