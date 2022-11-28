package com.tweet.user.dto;

import java.time.LocalDateTime;

public class TweetDTO {
	
	private int id;

	private String tweetDes;

	private String tweetTag;

	private LocalDateTime tweetDate;

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

	
	

}
