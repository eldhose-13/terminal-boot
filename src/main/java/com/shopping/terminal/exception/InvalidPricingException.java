package com.shopping.terminal.exception;

public class InvalidPricingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 128678370786992112L;

	public InvalidPricingException(String exMsg) {
		super(exMsg);
	}
	
}
