package com.babycare.model;

public class ContentConstant {
	public enum MediaType {
		TEXT("text", 1),
		HTML("html", 2),
		GIF("gif", 3),
		PNG("png", 4),
		JPG("jpg", 5),
		AUDIO("audio", 6),
		VIDEO("video", 7),
		PDF("pdf", 8);

		private String name;
		private int value;
		MediaType(String name, int value) {
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

	public enum TimeUnit {
		WEEK("WEEK", 1), DAY("DAY", 2);
		private String name;
		private int value;
		TimeUnit(String name, int value) {
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
