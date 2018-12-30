package com.spring.recipe.common.httpdto;

import java.util.List;
import java.util.Map;

public class HttpResponseGet {

	private static final String METHOD = "GET";
	// �����ڵ�
	private String code;
	// ����޽���
	private String message;
	// ���� ��ü
	private Map<String, Object> responseObject;
	// ���� ����Ʈ
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
