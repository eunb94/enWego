package com.wego.web.cs;

public enum HostSQL {
	CREATE_HOST,DROP_HOST;
	@Override
	public String toString() {
		String result = "";
		switch (this) {

		case CREATE_HOST:
			result = "CREATE TABLE HOST"
					+ "(SEQ INT(10) PRIMARY KEY AUTO_INCREMENT,"
					+ "HID VARCHAR(30) ,"
					+ "PWD VARCHAR(30) , "
					+ "HNAME VARCHAR(30),  "
					+ "CEONAME VARCHAR(30),  "
					+ "COMPANYTYPE VARCHAR(30), "
					+ "TEL VARCHAR(30), "
					+ "ADDR VARCHAR(100),"
					+ "LICENSENUM VARCHAR(30),"
					+ "HOSTINFO VARCHAR(500))";
			break;
		case DROP_HOST:
			result = "drop table HOST";
			break;
		default:
			break;
		}
		return result;
	}
}
