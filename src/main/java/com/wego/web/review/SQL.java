package com.wego.web.review;

public enum SQL {
	CREATE_REVIEW,DROP_REVIEW, TRUNCATE_REVIEW,CREATE_LIKE,CREATE_COMMENT;
	@Override
	public String toString() {
		String result = "";
		switch (this) {


		case CREATE_REVIEW:
			result = "CREATE TABLE COMMUNITY"
					+ "(ARTSEQ INT(10) PRIMARY KEY AUTO_INCREMENT,"
					+ "IMG VARCHAR(500) , "
					+ "UID VARCHAR(20),  "
					+ "COMMENTS VARCHAR(200),  "
					+ "RATING VARCHAR(10), "
					+ "BOARDTYPE VARCHAR(50), "
					+ "TITLE VARCHAR(100),"
					+ "CONTENT VARCHAR(500))";
			break;
		case CREATE_LIKE:
			result = "CREATE TABLE COMMUNITY"
					+ "(ARTSEQ INT(10) PRIMARY KEY AUTO_INCREMENT,"
					+ "IMG VARCHAR(500) , "
					+ "UID VARCHAR(20),  "
					+ "COMMENTS VARCHAR(200),  "
					+ "RATING VARCHAR(10), "
					+ "BOARDTYPE VARCHAR(50), "
					+ "TITLE VARCHAR(100),"
					+ "CONTENT VARCHAR(500))";
			break;
		case CREATE_COMMENT:
			result = "CREATE TABLE COMMUNITY"
					+ "(ARTSEQ INT(10) PRIMARY KEY AUTO_INCREMENT,"
					+ "IMG VARCHAR(500) , "
					+ "UID VARCHAR(20),  "
					+ "COMMENTS VARCHAR(200),  "
					+ "RATING VARCHAR(10), "
					+ "BOARDTYPE VARCHAR(50), "
					+ "TITLE VARCHAR(100),"
					+ "CONTENT VARCHAR(500))";
			break;
		case DROP_REVIEW:
			result = "drop table REVIEW";
			break;

		case TRUNCATE_REVIEW:
			result = "TRUNCATE TABLE REVIEW";
			break;
		default:
			break;
		}
		return result;
	}  

}
