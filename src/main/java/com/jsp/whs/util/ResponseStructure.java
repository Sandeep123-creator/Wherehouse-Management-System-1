package com.jsp.whs.util;

public class ResponseStructure<T> {
	
	private int Status;
	private  String Message;
	private T body;
	
	public int getStatus() {
		return Status;
	}
	public String getMessage() {
		return Message;
	}
	public T getBody() {
		return body;
	}
	public ResponseStructure<T> setStatus(int status) {
		Status = status;
		return this;
	}
	public ResponseStructure<T> setMessage(String message) {
		Message = message;
		return this;
	}
	public ResponseStructure<T> setBody(T body) {
		this.body = body;
		return this;
	}


}
