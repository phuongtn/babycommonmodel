package com.babycare.model;

public class MessageConstant {
	public enum MessageAction {
		ACCOUNT_CHANGED("ACCOUNT_CHANGED", 1),
		SESSION_CHANGED("SESSION_CHANGED", 2),
		CHILDREN_CHANGED("CHILDREN_CHANGED", 3);

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
