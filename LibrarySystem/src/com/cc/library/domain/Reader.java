package com.cc.library.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 读者类
 * @author c
 *
 */
public class Reader implements Serializable{

	private String readerId;	//证件号码
	private String name;	//真实名称
	private Integer sex;	//性别(0为男生，1为女生)
	private String phone;	//联系方式
	private String pwd; 	//密码
	private Integer type;	//读者类型(学生或者教师)
	private Integer maxNum;	//最大借书量
	
	
	private Set<BorrowInfo> borrowInfos;	//该读者的借阅信息
	private Set<ForfeitInfo>forfeitInfos;	//该读者的罚金缴纳信息
	
	private Integer state;	//状态(删除或者未删除,1表示未删除,0表示删除)
	
	
	
	public Integer getState() {
		return state;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setState(Integer state) {
		this.state = state;
	}


	public Set<BorrowInfo> getBorrowInfos() {
		return borrowInfos;
	}


	public void setBorrowInfos(Set<BorrowInfo> borrowInfos) {
		this.borrowInfos = borrowInfos;
	}


	
	
	public Set<ForfeitInfo> getForfeitInfos() {
		return forfeitInfos;
	}


	public void setForfeitInfos(Set<ForfeitInfo> forfeitInfos) {
		this.forfeitInfos = forfeitInfos;
	}


	public String getReaderId() {
		return readerId;
	}


	public void setReaderId(String readerId) {
		this.readerId = readerId;
	}

	public Integer getSex() {
		return sex;
	}


	public void setSex(Integer sex) {
		this.sex = sex;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public Integer getMaxNum() {
		return maxNum;
	}


	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}


	public Reader() {
		
	}



	public Reader(String readerId, String name, Integer sex, String phone,
			String pwd, Integer type, Integer maxNum,
			Set<BorrowInfo> borrowInfos, Set<ForfeitInfo> forfeitInfos,
			Integer state) {
		super();
		this.readerId = readerId;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.pwd = pwd;
		this.type = type;
		this.maxNum = maxNum;
		this.borrowInfos = borrowInfos;
		this.forfeitInfos = forfeitInfos;
		this.state = state;
	}



	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", name=" + name + ", sex="
				+ sex + ", phone=" + phone + ", pwd=" + pwd + ", type=" + type
				+ ", maxNum=" + maxNum + ", borrowInfos=" + borrowInfos
				+ ", forfeitInfos=" + forfeitInfos + ", state=" + state + "]";
	}


	
	
	
	
	
}
