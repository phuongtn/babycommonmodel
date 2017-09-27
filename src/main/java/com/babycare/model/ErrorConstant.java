package com.babycare.model;

public class ErrorConstant {
	
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
	public static final String ERROR_UPDATE_SESSION_MESSAGE = "Failed in updating session";
	
	public static final Long ERROR_ADD_SESSION = 7L;
	public static final String ERROR_ADD_SESSION_MESSAGE = "Failed in adding session";
	
	public static final Long ERROR_SESSION_NOT_EXIST = 8L;
	public static final String ERROR_SESSION_NOT_EXIST_MESSAGE = "Session does not exist";
	
	public static final Long ERROR_UPDATE_SESSION_STATUS = 9L;
	public static final String ERROR_UPDATE_SESSION_STATUS_MESSAGE = "Failed in updating session status";
	
	public static final Long ERROR_CREATE_USER = 10L;
	public static final String ERROR_CREATE_USER_MESSAGE = "Failed in creating user";
	
	public static final Long ERROR_UPDATE_SESSION_PUSHID = 11L;
	public static final String ERROR_UPDATE_SESSION_PUSHID_MESSAGE = "Failed in updating pushId";
	
	public static final Long ERROR_UPDATE_USER = 12L;
	public static final String ERROR_UPDATE_USER_MESSAGE = "Failed in updating user";
	
	public static final Long ERROR_ADD_CHILD = 13L;
	public static final String ERROR_ADD_CHILD_MESSAGE = "Failed in adding child";
	
	public static final Long ERROR_UPDATE_CHILD = 14L;
	public static final String ERROR_UPDATE_CHILD_MESSAGE = "Failed in editing child";
	
	public static final Long ERROR_CHILD_NOT_EXIST = 15L;
	public static final String ERROR_CHILD_NOT_EXIST_MESSAGE = "Child does not exist";

}
