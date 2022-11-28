package com.tweet.user.service;

import com.tweet.user.dto.RegisterDTO;

public interface UserServices {

	public RegisterDTO addUser(RegisterDTO dto);

	public void getAllUser(RegisterDTO registerDTO);

	public RegisterDTO getAllTweet(RegisterDTO listTweet);

}
