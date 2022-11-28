package com.tweet.user.repositroy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.tweet.user.entity.TweetEntity;

@Repository
public class TweetRepositryImpl implements TweetRepositry {

	/**
	 *
	 */
	public void createTweet(TweetEntity tweet) {

		Session s = Hibconnection.getSession();
		Transaction transaction = s.beginTransaction();
		Serializable save = s.save(tweet);
		transaction.commit();
		s.close();
	}

	/**
	 *
	 */
	public List<TweetEntity> getAll(TweetEntity entity) {
		Session s = Hibconnection.getSession();
		Transaction transaction = s.beginTransaction();
		Query createQuery = s.createQuery("from tweetentity e where e.id=?");
		List<TweetEntity> getTweet = new ArrayList<TweetEntity>();
		List list = createQuery.list();
		for (TweetEntity e : getTweet) {
			// list.stream().collect(Collectors.toList());
			System.out.println(e.getId() + "" + e.getTweetDes() + "--" + e.getTweetTag() + "--" + e.getTweetDate());
		}
		transaction.commit();
		s.close();
		return getTweet;
	}

}
