package com.wego.web.hotel;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public interface HotelMapper {
	public void createHotel(HashMap<String, String> paramMap);
	public void createRoom(HashMap<String, String> paramMap);
	public void insertHotel(Hotel param);
	public void insertRoom(Room param);
	
}
