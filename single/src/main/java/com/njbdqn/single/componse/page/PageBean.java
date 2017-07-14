package com.njbdqn.single.componse.page;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	private IPageDAO<T> pdao;

	public PageBean(IPageDAO<T> pageDao) {
		this.pdao = pageDao;
	}

	private int countPage = 0;
	private int prev = 0;
	private int next = 0;
	private List<T> data = new ArrayList<T>();
	private PageInParam pip = new PageInParam();

	public PageBean<T> findBean() {
		countPage = pdao.findCountPage(pip);
		prev = pip.getCurrentPage() - 1 < 1 ? 1 : pip.getCurrentPage() - 1;
		next = pip.getCurrentPage() + 1 > countPage ? countPage : pip.getCurrentPage() + 1;
		data = pdao.findCurrentPageData(pip);
		return this;
	}

	public IPageDAO<T> getPdao() {
		return pdao;
	}

	public void setPdao(IPageDAO<T> pdao) {
		this.pdao = pdao;
	}

	public int getCountPage() {
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public PageInParam getPip() {
		return pip;
	}

	public void setPip(PageInParam pip) {
		this.pip = pip;
	}
}
