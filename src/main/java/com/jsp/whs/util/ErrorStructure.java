package com.jsp.whs.util;

public class ErrorStructure<T> {
	
	private int Status;
	private String Message;
	private T rootCause;
	
	public int getStatus() {
		return Status;
	}
	public String getMessage() {
		return Message;
	}
	public T getRootCause() {
		return rootCause;
	}
	public ErrorStructure<T> setStatus(int status) {
		Status = status;
		return this;
	}
	public ErrorStructure<T> setMessage(String message) {
		Message = message;
		return this;
	}
	public ErrorStructure<T> setRootCause(T rootCause) {
		this.rootCause = rootCause;
		return this;
	}
	
	

}
