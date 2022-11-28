package com.tweet.user.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class RegisterEntity {

	@Id
	@GeneratedValue
	private Integer userid;
	
	@Column(name="name")
	private String firstName;

	@Column(name="name")
	private String lastName;

	@Column(name="us-email")
	private String email;

	@Column(name="us-password")
	private String password;

	@Column(name="us-contactNum")
	private long contactNum;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userTweet")
	private List<TweetEntity> listOfTweets;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public List<TweetEntity> getListOfTweets() {
		return listOfTweets;
	}

	public void setListOfTweets(List<TweetEntity> listOfTweets) {
		this.listOfTweets = listOfTweets;
	}

	@Override
	public String toString() {
		return "RegisterEntity [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email +  ", password=" + password + ", contactNum=" + contactNum
				+ ", listOfTweets=" + listOfTweets + "]";
	}
	
	
	
	


}
