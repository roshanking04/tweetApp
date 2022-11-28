package com.tweet.user.repositroy;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.tweet.user.entity.RegisterEntity;
import com.tweet.user.entity.TweetEntity;

@Repository
public class RegisterRepositryImpl implements RegisterRepositry {

	/**
	 *
	 */
	public RegisterEntity addUser(RegisterEntity entity) {
		Session session = Hibconnection.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(entity);
		beginTransaction.commit();
		session.close(); 
		return entity;
	}

	/**
	 *
	 */
	public void getAllUser(RegisterEntity listUser) {
		Session session = Hibconnection.getSession();
		Query createQuery = session.createQuery("from registerEntity");
		Transaction beginTransaction = session.beginTransaction();

		List<RegisterEntity> list = createQuery.list();
		for (RegisterEntity user : list) {
			System.out.println(user.getFirstName() + "---" + user.getLastName() + "--" + user.getUserid() + "--"
					+ user.getContactNum());
		}
		beginTransaction.commit(); 
		session.close();
	}

	/**
	 *
	 */
	public RegisterEntity getAllTweet(RegisterEntity userTweet) {
		Session s = Hibconnection.getSession();
		Query q = s.createQuery("from tweetEntity");
		Transaction beginTransaction = s.beginTransaction();
		List<RegisterEntity> userlist = q.list();
		List<TweetEntity> list = q.list();
		for (RegisterEntity user : userlist) {
			System.out.println(user.getFirstName() + "---" + user.getLastName() + "--" + user.getUserid() + "--"
					+ user.getContactNum());
			List<TweetEntity> mp = user.getListOfTweets();
			for (TweetEntity m : list) { 
				System.out.println(m.getTweetDes() + "::::::" + m.getTweetTag() + "::::::" + m.getTweetDate());
			}

		}
		beginTransaction.commit();
		s.close();
		return userTweet;
	}

}
