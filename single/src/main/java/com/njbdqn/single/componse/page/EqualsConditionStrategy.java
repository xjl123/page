package com.njbdqn.single.componse.page;

public class EqualsConditionStrategy implements IAbstractConditionStrategy{

	public String getSQLCondition(String conds) {
		return " " + conds.replace(":", " ='") + "' ";
	}

}
