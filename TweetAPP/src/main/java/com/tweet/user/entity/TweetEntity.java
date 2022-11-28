package com.tweet.user.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tweet")
public class TweetEntity {

	@Id
	@GeneratedValue
	private int id;

	@Column(name="tw-deg")
	private String tweetDes;

	@Column(name="tw-Tag")
	private String tweetTag;

	@Column(name="'tw-date")
	private LocalDateTime tweetDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user-tweet")
	private List<RegisterEntity> userTweet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTweetDes() {
		return tweetDes;
	}

	public void setTweetDes(String tweetDes) {
		this.tweetDes = tweetDes;
	}

	public String getTweetTag() {
		return tweetTag;
	}

	public void setTweetTag(String tweetTag) {
		this.tweetTag = tweetTag;
	}

	public LocalDateTime getTweetDate() {
		return tweetDate;
	}

	public void setTweetDate(LocalDateTime tweetDate) {
		this.tweetDate = tweetDate;
	}

	public List<RegisterEntity> getUserTweet() {
		return userTweet;
	}

	public void setUserTweet(List<RegisterEntity> userTweet) {
		this.userTweet = userTweet;
	}

	@Override
	public String toString() {
		return "TweetDTO [id=" + id + ", tweetDes=" + tweetDes + ", tweetTag=" + tweetTag + ", tweetDate=" + tweetDate
				+ ", userTweet=" + userTweet + "]";
	}

}
