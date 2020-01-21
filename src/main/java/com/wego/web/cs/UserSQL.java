package com.wego.web.cs;

public enum UserSQL {
	CREATE_USER,DROP_USER;
	@Override
	public String toString() {
		String result = "";
		
		switch (this) {
		case CREATE_USER:
			result = "CREATE TABLE USER"
					+ "(seq INT(10) PRIMARY KEY AUTO_INCREMENT,"
					+ "uid VARCHAR(30) ,"
					+ "pwd VARCHAR(30) ,"
					+ "uname VARCHAR(30) ,"
					+ "nickname VARCHAR(30) ,"
					+ "birth VARCHAR(30) ,"
					+ "tel VARCHAR(30) ,"
					+ "pettype VARCHAR(30))";
			break;
		case DROP_USER :
			result = "drop table USER";
			break;
		default:
			break;
		}
		return result;
	}
	
	
	
}
