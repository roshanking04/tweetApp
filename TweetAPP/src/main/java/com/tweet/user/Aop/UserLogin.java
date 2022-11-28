package com.tweet.user.Aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.tweet.user.dto.RegisterDTO;
import com.tweet.user.dto.TweetDTO;
import com.tweet.user.entity.RegisterEntity;
import com.tweet.user.entity.TweetEntity;
import com.tweet.user.exceptionHandle.PasswordInvalidException;

@Controller
public class UserLogin {

	/**
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) {
		RegisterEntity re = new RegisterEntity();
		re.setEmail(email);
		re.setPassword(password);
		if (re != null) {
			re.getFirstName();
			re.getLastName();
			re.getUserid();
			re.getContactNum();
			List<TweetEntity> tweetList = new ArrayList<TweetEntity>();
			TweetEntity dto = new TweetEntity();
			tweetList.add(dto);
			dto.getTweetDes();
			re.getListOfTweets();
		} else {
			PasswordInvalidException exception = new PasswordInvalidException();
			exception.getClass();
		}

	}

	public void forgetpassword(String email, String password) {

	}

	public void updateUser() {

	}

	public void logOut(String email, String Password) {

	}

}
