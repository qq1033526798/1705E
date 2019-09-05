package com.zzk.goods.domain;

public class Goods {
	private Integer gid;
	private String gname;
	private String Englishname;
	private Integer chicun;
	private Double money;
	private Integer sum;
	private String biaoqian;
	private Brand bid;
	private Goodskind kid;
	public Brand getBid() {
		return bid;
	}
	public void setBid(Brand bid) {
		this.bid = bid;
	}
	public Goodskind getKid() {
		return kid;
	}
	public void setKid(Goodskind kid) {
		this.kid = kid;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEnglishname() {
		return Englishname;
	}
	public void setEnglishname(String englishname) {
		Englishname = englishname;
	}
	public Integer getChicun() {
		return chicun;
	}
	public void setChicun(Integer chicun) {
		this.chicun = chicun;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	
}
