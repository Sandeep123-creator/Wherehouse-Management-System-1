package com.jsp.whs.exception;

public class IllegalOperationException extends RuntimeException {
	
	private String Message;

	public IllegalOperationException(String message) {
		super();
		Message = message;
	}
	public String getMessage() {
		return Message;
	}
	

}
