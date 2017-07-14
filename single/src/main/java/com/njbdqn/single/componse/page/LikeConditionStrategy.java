package com.njbdqn.single.componse.page;

public class LikeConditionStrategy implements IAbstractConditionStrategy{

	public String getSQLCondition(String conds) {
		return " " + conds.replace(":", " like'") + "' ";
	}

}
