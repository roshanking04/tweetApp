package com.tweet.user.repositroy;

import com.tweet.user.entity.RegisterEntity;

public interface RegisterRepositry {

	 public RegisterEntity addUser(RegisterEntity entity);
	 public void getAllUser(RegisterEntity listUser);
	 public RegisterEntity getAllTweet(RegisterEntity userTweet);

}
