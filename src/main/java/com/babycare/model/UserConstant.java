package com.babycare.model;

public class UserConstant {
	
		public enum Provider {
			FACEBOOK("FACEBOOK", 1), GOOGLE("GOOGLE", 2), EMAIL("EMAIL", 3);
			private String name;
			private int value;
	
			Provider(String name, int value) {
				this.name = name;
				this.value = value;
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
		
		public enum Status {
			SIGNIN("SIGNIN", 1),
			SIGNOUT("SIGNOUT", 0);

			private String name;
			private int value;

			Status(String name, int value) {
				this.setName(name);
				this.setValue(value);
			}

			public int getValue() {
				return value;
			}

			public void setValue(int value) {
				this.value = value;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public enum Platform {

			ANDROID("ANDROID", 1),
			IOS("IOS", 2),
			WEB("WEB", 3);
			
			private String name;
			private int value;
			
			Platform(String name, int value) {
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
