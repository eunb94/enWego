package com.wego.web.hotel;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Lazy
public class Hotel {		
	private String hotelname, hotelimg, comments, hid,  uid, haddr,indate,outdate;
	private double rating;
	private int price;
	public Hotel(String hotelname,double rating,String hid,String comments,String hotelimg,int price,String haddr) {
		this.hotelname = hotelname;
		this.rating = rating;
		this.hid = hid;
		this.comments = comments;
		this.hotelimg = hotelimg;
		this.price =price;
		this.haddr =haddr;
		
	}
	
}
