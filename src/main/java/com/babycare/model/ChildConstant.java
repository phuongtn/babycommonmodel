package com.babycare.model;

public class ChildConstant {
	public enum Blood {
		O("O", 1), A("A", 2), B("B", 3), AB("AB", 4), UNKNOWN("UNKNOWN", 5);
		private String name;
		private int value;

		Blood(String name, int value) {
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
	
	public enum GENDER {
		M("M", 1), F("F", 2), UNKNOWN("UNKNOWN", 3);
		private String name;
		private int value;

		GENDER(String name, int value) {
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
	
	public enum REGION {
		ASIA("ASIA", 1), 
		EUROPE("EUROPE", 2), 
		AFRICA("AFRICA", 3),
		AUSTRALIA("AUSTRALIA", 4),
		NorthAmerica("NorthAmerica", 5),
		SouthAmerica("SouthAmerica", 6),
		UNKNOWN("UNKNOWN", 7);
		private String name;
		private int value;

		REGION(String name, int value) {
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
	
	public enum BABY {
		PREMATURE("PREMATURE", 1), 
		BORNED("BORNED", 2);
		private String name;
		private int value;

		BABY(String name, int value) {
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
}
