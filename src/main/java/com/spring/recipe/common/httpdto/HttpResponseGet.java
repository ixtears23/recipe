package com.spring.recipe.common.httpdto;

import java.util.List;
import java.util.Map;

public class HttpResponseGet {

	private static final String METHOD = "GET";
	// 응답코드
	private String code;
	// 응답메시지
	private String message;
	// 응답 객체
	private Map<String, Object> responseObject;
	// 응답 리스트
	private List<Map<String, Object>> responseList;

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

	public Map<String, Object> getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Map<String, Object> responseObject) {
		this.responseObject = responseObject;
	}

	public List<Map<String, Object>> getResponseList() {
		return responseList;
	}

	public void setResponseList(List<Map<String, Object>> responseList) {
		this.responseList = responseList;
	}

	public static String getMethod() {
		return METHOD;
	}

}
