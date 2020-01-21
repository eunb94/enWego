package com.wego.web.hotel;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wego.web.util.Printer;



@RestController
@RequestMapping("/hotels")
public class HotelControlller {
	@Autowired HotelMapper hotelMapper;
	@Autowired HotelProxy hotelProxy;
	@Autowired RoomProxy roomProxy;
	@Autowired Printer printer; 
	
	@GetMapping("/create/hoteltable/")
	public Map<?,?> createHotel(){
		HashMap<String,String> paramMap = new HashMap<>();
		System.out.println("hoteltable");
    	paramMap.put("CREATE_HOTEL", SQL.CREATE_HOTEL.toString());
    	System.out.println("hoteltable"+SQL.CREATE_HOTEL.toString());
    	Consumer<HashMap<String,String>> c = t-> hotelMapper.createHotel(paramMap);
    	c.accept(paramMap);
    	paramMap.clear();
    	paramMap.put("msg", "SUCCESS");
		return paramMap;
	}
	
	@GetMapping("/insert/hotelDB/")
	public Map<?,?> insertHotelDB(){
		printer.accept("컨트롤러 들어옴");
		HashMap<String, String> paramMap = new HashMap<>();
		hotelProxy.insertHotelDB();
		paramMap.clear();
    	paramMap.put("msg", "SUCCESS");
		return paramMap;
	}
	@GetMapping("/create/roomtable/")
	public Map<?,?> createRoom(){
		HashMap<String,String> paramMap = new HashMap<>();
		System.out.println("createRoom");
    	paramMap.put("CREATE_ROOM", SQL.CREATE_ROOM.toString());
    	System.out.println("createRoom"+SQL.CREATE_ROOM.toString());
    	Consumer<HashMap<String,String>> c = t-> hotelMapper.createRoom(paramMap);
    	c.accept(paramMap);
    	paramMap.clear();
    	paramMap.put("msg", "SUCCESS");
		return paramMap;
	}
	
	@GetMapping("/insert/roomdb/")
	public Map<?,?> insertRoomDB(){
		printer.accept("컨트롤러 들어옴");
		HashMap<String, String> paramMap = new HashMap<>();
		roomProxy.insertRoomDB();
		paramMap.clear();
    	paramMap.put("msg", "SUCCESS");
		return paramMap;
	}
}
