package com.lemon.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class User {

	@Id
	@GeneratedValue
	private String userId;

	@Column(name = "userName", nullable = true, length = 40)
	private String userName;

	@Column(name = "birthday", nullable = true, length = 40)
	private Date birthday;

	@Column(name = "gender", nullable = true, length = 20)
	private String gender;

	@Column(name = "openId", nullable = true, length = 40)
	private String openId;

	@Column(name = "createTime", nullable = true, length = 40)
	private Date createTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
