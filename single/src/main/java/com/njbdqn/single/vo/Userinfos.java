package com.njbdqn.single.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Userinfos implements Serializable
{
	private int userid;
	private String username;
	private String userphoto;
	private Date birthday;
	private double money;
	private List<Bankcards> cards = new ArrayList<Bankcards>();
	public List<Bankcards> getCards() {
		return cards;
	}
	public void setCards(List<Bankcards> cards) {
		this.cards = cards;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphoto() {
		return userphoto;
	}
	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
