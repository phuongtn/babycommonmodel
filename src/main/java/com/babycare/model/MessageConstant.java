package com.babycare.model;

public class MessageConstant {
	public enum MessageAction {
		ACCOUNT_CHANGE("ACCOUNT_CHANGE", 1),
		SESSION_CHANGE("SESSION_CHANGE", 2),
		CHILDREN_CHANGE("CHILDREN_CHANGE", 3);

		private String name;
		private int value;

		MessageAction(String name, int value) {
			this.setName(name);
			this.setValue(value);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
}
