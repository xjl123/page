package com.njbdqn.single.vo;

import java.io.Serializable;

public class Bankcards implements Serializable{
	private int cardid;
	private int userid;
	private double balance;
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
