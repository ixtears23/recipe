package com.spring.recipe.common.httpdto;

import java.util.Map;

public class HttpResponsePost {
	
	private static final String METHOD = "POST";
	// 응답코드
	private String code;
	// 응답메시지
	private String message;
	// 응답 객체
	private Object responseObject;
	
	public HttpResponsePost(Object object) {
		responseObject = object;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Map<String, Object> responseObject) {
		this.responseObject = responseObject;
	}

	public static String getMethod() {
		return METHOD;
	}

}
