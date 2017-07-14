package com.njbdqn.single.componse.page;

public class PageInParam {
	private int currentPage = 1;
	private int pageSize = 10;
	private String conds;
	private String sqlCond;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getConds() {
		return conds;
	}
	public void setConds(String conds) {
		this.conds = conds;
		this.sqlCond = "";
		String [] cond = conds.split(";");
		ConditionStrategy cs = new ConditionStrategy();
		for (String cd : cond) {
			sqlCond += " and" + cs.getSQLCondition(cd);
		}
		sqlCond = sqlCond.replaceFirst("and", "");
	}
	public String getSqlCond() {
		return sqlCond;
	}
}
