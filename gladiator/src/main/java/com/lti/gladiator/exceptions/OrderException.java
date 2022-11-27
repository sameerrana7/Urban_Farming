package com.lti.gladiator.exceptions;

public class OrderException extends Exception {

	public OrderException() {
		super();
	}

	public OrderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OrderException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderException(String message) {
		super(message);
	}

	public OrderException(Throwable cause) {
		super(cause);
	}

}
