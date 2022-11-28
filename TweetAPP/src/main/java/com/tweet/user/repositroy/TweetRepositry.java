package com.tweet.user.repositroy;

import java.util.List;

import com.tweet.user.entity.TweetEntity;

public interface TweetRepositry {
	
	public void createTweet(TweetEntity tweet);
	
	public List<TweetEntity> getAll(TweetEntity entity);

}
