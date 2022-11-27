package com.lti.gladiator.exceptions;

public class RetailerException extends Exception {

	public RetailerException() {
		super();
	}

	public RetailerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RetailerException(String message, Throwable cause) {
		super(message, cause);
	}

	public RetailerException(String message) {
		super(message);
	}

	public RetailerException(Throwable cause) {
		super(cause);
	}

}
