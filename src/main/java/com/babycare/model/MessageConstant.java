package com.babycare.model;

public class MessageConstant {
	public enum MessageAction {
		ACCOUNT_CHANGE("ACCOUNT_CHANGE", 1),
		SESSION_CHANGE("ACCOUNT_CHANGE", 2),
		CHILDREN_CHANGE("ACCOUNT_CHANGE", 3);

		private String name;
		private int value;

		MessageAction(String name, int value) {
			this.name = name;
			this.value = value;
		}
	}
}
