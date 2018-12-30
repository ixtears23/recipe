package com.spring.recipe.common.httpdto;

import java.util.Map;

public class HttpResponsePost {
	
	private static final String METHOD = "POST";
	// �����ڵ�
	private String code;
	// ����޽���
	private String message;
	// ���� ��ü
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
