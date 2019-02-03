package com.lemon.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="lemon_user")//设置数据库中表名字
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(name = "USER_NAME", nullable = true, length = 40)
	private String userName;

	@Column(name = "BIRTHDAY", nullable = true, length = 40)
	private Date birthday;

	@Column(name = "GENDER", nullable = true, length = 20)
	private String gender;

	@Column(name = "OPEN_ID", nullable = true, length = 40)
	private String openId;

	@Column(name = "CREATE_TIME", nullable = true, length = 40)
	private Date createTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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
