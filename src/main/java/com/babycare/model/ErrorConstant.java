package com.babycare.model;

import java.util.HashMap;
import java.util.Map;

public class ErrorConstant {
	
	private static Map<Long, String> errorMap = new HashMap<Long, String>();

	public static final Long ERROR_UNKNOWN = 0L;
	public static final String ERROR_UNKNOWN_MESSAGE = "Unknown exception";
	
	public static final Long ERROR_EMAIL_INVALID = 1L;
	public static final String ERROR_EMAIL_INVALID_MESSAGE = "Invalid email";

	public static final Long ERROR_USER_NOT_EXIST = 2L;
	public static final String ERROR_USER_NOT_EXIST_MESSAGE = "User does does not exist";

	public static final Long ERROR_USER_EXIST = 3L;
	public static final String ERROR_USER_EXIST_MESSAGE = "User exist";

	public static final Long ERROR_PUSHID_INVALID = 4L;
	public static final String ERROR_PUSHID_INVALID_MESSAGE = "PushID is not empty";
	
	public static final Long ERROR_INPUT_ERROR = 5L;
	public static final String ERROR_INPUT_ERROR_MESSAGE = "Invalid Data Input";

	public static final Long ERROR_UPDATE_SESSION = 6L;
	public static final String ERROR_UPDATE_SESSION_MESSAGE = "Failed to update session";
	
	public static final Long ERROR_ADD_SESSION = 7L;
	public static final String ERROR_ADD_SESSION_MESSAGE = "Failed to add session";
	
	public static final Long ERROR_SESSION_NOT_EXIST = 8L;
	public static final String ERROR_SESSION_NOT_EXIST_MESSAGE = "Session does not exist";
	
	public static final Long ERROR_UPDATE_SESSION_STATUS = 9L;
	public static final String ERROR_UPDATE_SESSION_STATUS_MESSAGE = "Failed to update session status";
	
	public static final Long ERROR_CREATE_USER = 10L;
	public static final String ERROR_CREATE_USER_MESSAGE = "Failed to create user";
	
	public static final Long ERROR_UPDATE_SESSION_PUSHID = 11L;
	public static final String ERROR_UPDATE_SESSION_PUSHID_MESSAGE = "Failed to updat pushId";
	
	public static final Long ERROR_UPDATE_USER = 12L;
	public static final String ERROR_UPDATE_USER_MESSAGE = "Failed to update user";
	
	public static final Long ERROR_ADD_CHILD = 13L;
	public static final String ERROR_ADD_CHILD_MESSAGE = "Failed to add child";
	
	public static final Long ERROR_UPDATE_CHILD = 14L;
	public static final String ERROR_UPDATE_CHILD_MESSAGE = "Failed to update child";
	
	public static final Long ERROR_CHILD_NOT_EXIST = 15L;
	public static final String ERROR_CHILD_NOT_EXIST_MESSAGE = "Child does not exist";
	
	public static final Long ERROR_REMOVE_CHILD = 16L;
	public static final String ERROR_REMOVE_CHILD_MESSAGE = "Failed to remove child";
	
	public static final Long ERROR_FETCH_CHILD = 17L;
	public static final String ERROR_FETCH_CHILD_MESSAGE = "Failed to fetch child";
	
	public static final Long ERROR_USER_NOT_SIGNIN = 18L;
	public static final String ERROR_USER_NOT_SIGNIN_MESSAGE = "User does not sign in yet";

	public static final Long ERROR_FETCH_CONTENT_TYPE = 19L;
	public static final String ERROR_FETCH_CONTENT_TYPE_MESSAGE = "Failed to fetch content type";
	
	public static final Long ERROR_FETCH_SESSION =20L;
	public static final String ERROR_FETCH_SESSION_MESSAGE ="Failed to fetch sessions";
	
	public static final Long ERROR_RECORD_NOT_FOUND = 21L;
	public static final String ERROR_RECORD_NOT_FOUND_MESSAGE = "Record not found";

	public static final Long ERROR_ADD_CONTENT = 22L;
	public static final String ERROR_ADD_CONTENT_MESSAGE = "Failed to add content";

	public static final Long ERROR_REMOVE_USER = 23L;
	public static final String ERROR_REMOVE_USER_MESSAGE = "Failed to remove user";

	static {
		errorMap.put(ERROR_UNKNOWN, ERROR_UNKNOWN_MESSAGE);
		errorMap.put(ERROR_EMAIL_INVALID, ERROR_EMAIL_INVALID_MESSAGE);
		errorMap.put(ERROR_USER_NOT_EXIST, ERROR_USER_NOT_EXIST_MESSAGE);
		errorMap.put(ERROR_USER_EXIST, ERROR_USER_EXIST_MESSAGE);
		errorMap.put(ERROR_INPUT_ERROR, ERROR_INPUT_ERROR_MESSAGE);
		errorMap.put(ERROR_UPDATE_SESSION, ERROR_UPDATE_SESSION_MESSAGE);
		errorMap.put(ERROR_ADD_SESSION, ERROR_ADD_SESSION_MESSAGE);
		errorMap.put(ERROR_SESSION_NOT_EXIST, ERROR_SESSION_NOT_EXIST_MESSAGE);
		errorMap.put(ERROR_UPDATE_SESSION_STATUS, ERROR_UPDATE_SESSION_STATUS_MESSAGE);
		errorMap.put(ERROR_CREATE_USER, ERROR_CREATE_USER_MESSAGE);
		errorMap.put(ERROR_UPDATE_SESSION_PUSHID, ERROR_UPDATE_SESSION_PUSHID_MESSAGE);
		errorMap.put(ERROR_UPDATE_USER, ERROR_UPDATE_USER_MESSAGE);
		errorMap.put(ERROR_ADD_CHILD, ERROR_ADD_CHILD_MESSAGE);
		errorMap.put(ERROR_UPDATE_CHILD, ERROR_UPDATE_CHILD_MESSAGE);
		errorMap.put(ERROR_CHILD_NOT_EXIST, ERROR_CHILD_NOT_EXIST_MESSAGE);
		errorMap.put(ERROR_REMOVE_CHILD, ERROR_REMOVE_CHILD_MESSAGE);
		errorMap.put(ERROR_FETCH_CHILD, ERROR_FETCH_CHILD_MESSAGE);
		errorMap.put(ERROR_USER_NOT_SIGNIN, ERROR_USER_NOT_SIGNIN_MESSAGE);
		errorMap.put(ERROR_FETCH_CONTENT_TYPE, ERROR_FETCH_CONTENT_TYPE_MESSAGE);
		errorMap.put(ERROR_FETCH_SESSION, ERROR_FETCH_SESSION_MESSAGE);
		errorMap.put(ERROR_RECORD_NOT_FOUND, ERROR_RECORD_NOT_FOUND_MESSAGE);
		errorMap.put(ERROR_ADD_CONTENT, ERROR_ADD_CONTENT_MESSAGE);
	}
	
	public static Error getError(Long errorCode) {
		return new Error(errorCode, errorMap.get(errorCode));
	}
	
	public static Error getError(Long errorCode, String exception) {
		return new Error(errorCode, errorMap.get(errorCode), exception);
	}

}
