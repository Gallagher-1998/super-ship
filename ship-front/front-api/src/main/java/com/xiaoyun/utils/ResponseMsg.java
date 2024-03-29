package com.xiaoyun.utils;

public class ResponseMsg {

	private int code;
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"code\":\"");
		builder.append(code);
		builder.append("\", \"message\":\"");
		builder.append(message);
		builder.append("\"}");
		return builder.toString();
	}
	
	
	
	
}
