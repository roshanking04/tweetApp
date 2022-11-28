package com.tweet.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweet.user.dto.TweetDTO;
import com.tweet.user.entity.TweetEntity;
import com.tweet.user.exceptionHandle.PasswordInvalidException;
import com.tweet.user.repositroy.TweetRepositry;

@Service
public class TweetServiceIMpl implements TweetService {

	@Autowired
	private TweetRepositry repositry;

	/**
	 *
	 */
	public TweetDTO tweet(TweetDTO tweetDTO) {
		TweetEntity entity = new TweetEntity();
		if (tweetDTO != null) {
			entity.setId(tweetDTO.getId());
			entity.setTweetDes(tweetDTO.getTweetDes());
			entity.setTweetTag(tweetDTO.getTweetTag());
			entity.setTweetDate(tweetDTO.getTweetDate());
			repositry.createTweet(entity);
		} else {
		}
		System.out.println("invaled tweet");

		return tweetDTO;
	}

	/**
	 *
	 */
	public List<TweetDTO> getAlltweet(TweetDTO dto) {
		List<TweetDTO> entities = new ArrayList<TweetDTO>();
		TweetEntity entity = new TweetEntity();

		List<TweetEntity> all = repositry.getAll(entity);
		if (all == null) {
			entity.setId(dto.getId());
			entity.setTweetDes(dto.getTweetDes());
			entity.setTweetDate(dto.getTweetDate());
			entity.setTweetTag(dto.getTweetTag());
			repositry.getAll(entity);
		} else {
			System.out.println("invalude entiry");
		}

		return entities;
	}

}
