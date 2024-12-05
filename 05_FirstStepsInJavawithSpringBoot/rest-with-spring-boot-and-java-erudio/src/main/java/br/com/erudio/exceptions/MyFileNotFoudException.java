package br.com.erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoudException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public MyFileNotFoudException(String ex) {
		super(ex);
	}

	public MyFileNotFoudException(String ex, Throwable cause) {
		super(ex, cause);
	}
	
	
}

	