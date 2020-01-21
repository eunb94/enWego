package com.wego.web.hotel;

public enum SQL {
	CREATE_HOTEL,CREATE_ROOM;
	
	@Override
	public String toString() {
		String result = "";
		switch (this) {


		case CREATE_HOTEL:
			result = "CREATE TABLE HOTEL"
					+ "(HOTELNAME VARCHAR(30) PRIMARY KEY,"
					+ "HOTELIMG VARCHAR(500),"
					+ "RATING DOUBLE,"
					+ "COMMENTS VARCHAR(500),"
					+ "HID VARCHAR(30),"
					+ "PRICE INT,"
					+ "INDATE VARCHAR(30),"
					+ "OUTDATE VARCHAR(30),"
					+ "UID VARCHAR(30),"
					+ "HADDR VARCHAR(50))";
			break;
		case CREATE_ROOM:
			result = "CREATE TABLE ROOM"
					+ "(ROOMTYPE VARCHAR(300) PRIMARY KEY,"
					+ "ROOMIMG VARCHAR(500),"
					+ "HOTELNAME VARCHAR(30))";
			break;	
	
		}
		return result;
	}  
}
