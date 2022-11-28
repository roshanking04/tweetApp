package com.tweet.user.service;

import java.util.List;

import com.tweet.user.dto.TweetDTO;

public interface TweetService {

	public TweetDTO tweet(TweetDTO tweetDTO);
	public List<TweetDTO> getAlltweet(TweetDTO dto);

}
