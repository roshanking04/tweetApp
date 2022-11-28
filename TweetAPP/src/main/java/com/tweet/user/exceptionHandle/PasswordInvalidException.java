package com.tweet.user.exceptionHandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tweet.user.repsonce.ErrorResponse;

@ControllerAdvice
public class PasswordInvalidException {

	/**
	 * @param Exception
	 */
	public  void PasswordInvalidException(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode("password incorrect ");
		error.setDescription(ex.getMessage());
		error.setException(ex); 

	}
	
}