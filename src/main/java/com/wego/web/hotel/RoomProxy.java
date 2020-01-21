package com.wego.web.hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import lombok.Data;

@Data
@Component
public class RoomProxy {
	@Autowired HotelMapper hotelMapper;
	
	public List<String> hotelnameList() {
		List<String> hotelname = Arrays.asList("플레이저 프레이스 센트럴 서울","플레이저 프레이스 센트럴 서울","리오 모텔","알로프트 서울 강남","알로프트 서울 강남",
				"아이하우스 친친","아이하우스 친친",
				"한옥 레지던스 호텔 사이드","한옥 레지던스 호텔 사이드",
				"류게스트하우스","류게스트하우스",
				"남산 포레스트 시티",
				"디 원 호스텔","디 원 호스텔",
				"오슬로 모텔 방배","오슬로 모텔 방배",
				"오아시스 게스트하우스 서울","오아시스 게스트하우스 서울",
				"리안 게스트하우스 호스텔","리안 게스트하우스 호스텔",
				"오크우드 프리미어 인천","오크우드 프리미어 인천",
				"호텔 엠스토리","호텔 엠스토리",
				"호텔 파비아","호텔 파비아",
				"수원 퍼시픽 호텔",
				"두루와 호텔","두루와 호텔",
				"사과꽃향기 펜션","사과꽃향기 펜션",
				"리츠모텔");
		
		return hotelname;
	}
	public List<String> roomimgList() {
		List<String> roomimg = Arrays.asList("https://exp.cdn-hotels.com/hotels/2000000/1530000/1528600/1528555/187bddf0_b.jpg",
				"https://exp.cdn-hotels.com/hotels/2000000/1530000/1528600/1528555/7cc165f7_b.jpg",
				"https://exp.cdn-hotels.com/hotels/40000000/39760000/39757400/39757330/86df6c02_b.jpg",
				"https://exp.cdn-hotels.com/hotels/9000000/8770000/8762900/8762820/01b38d28_b.jpg",
				"https://exp.cdn-hotels.com/hotels/9000000/8770000/8762900/8762820/03a00032_b.jpg",
				"https://exp.cdn-hotels.com/hotels/11000000/10640000/10630800/10630729/700c36bb_b.jpg",
				"https://exp.cdn-hotels.com/hotels/11000000/10640000/10630800/10630729/98f72664_b.jpg",
				"https://exp.cdn-hotels.com/hotels/17000000/16270000/16267100/16267029/f8b790d0_b.jpg",
				"https://exp.cdn-hotels.com/hotels/17000000/16270000/16267100/16267029/f6ad45fc_b.jpg",
				"https://exp.cdn-hotels.com/hotels/16000000/15160000/15157500/15157404/7685d33a_b.jpg",
				"https://exp.cdn-hotels.com/hotels/16000000/15160000/15157500/15157404/7685d33a_b.jpg",
				"https://exp.cdn-hotels.com/hotels/34000000/33070000/33064700/33064680/976cbcbd_b.jpg",
				"https://exp.cdn-hotels.com/hotels/12000000/11020000/11017800/11017715/fa820e75_b.jpg",
				"https://exp.cdn-hotels.com/hotels/12000000/11020000/11017800/11017715/d650a32c_b.jpg",
				"https://exp.cdn-hotels.com/hotels/37000000/36350000/36344100/36344074/5d571b22_b.jpg",
				"https://exp.cdn-hotels.com/hotels/37000000/36350000/36344100/36344074/5d571b22_b.jpg",
				"https://exp.cdn-hotels.com/hotels/42000000/41990000/41985200/41985178/0bb782db_b.jpg",
				"https://exp.cdn-hotels.com/hotels/42000000/41990000/41985200/41985178/fe647c17_b.jpg",
				"https://exp.cdn-hotels.com/hotels/13000000/12610000/12601100/12601009/6d291c17_b.jpg",
				"https://exp.cdn-hotels.com/hotels/13000000/12610000/12601100/12601009/58b15226_b.jpg",
				"https://exp.cdn-hotels.com/hotels/9000000/8330000/8322700/8322634/67abfecc_b.jpg",
				"https://exp.cdn-hotels.com/hotels/9000000/8330000/8322700/8322634/c628b9d5_b.jpg",
				"https://exp.cdn-hotels.com/hotels/19000000/18600000/18597300/18597296/2277fc6a_b.jpg",
				"https://exp.cdn-hotels.com/hotels/19000000/18600000/18597300/18597296/38a88423_b.jpg",
				"https://exp.cdn-hotels.com/hotels/3000000/2180000/2179400/2179398/ff103445_b.jpg",
				"https://exp.cdn-hotels.com/hotels/3000000/2180000/2179400/2179398/a1f95ac8_b.jpg",
				"https://exp.cdn-hotels.com/hotels/11000000/10660000/10659700/10659601/195da808_b.jpg",
				"https://exp.cdn-hotels.com/hotels/12000000/11030000/11028600/11028519/105130f2_b.jpg",
				"https://exp.cdn-hotels.com/hotels/12000000/11030000/11028600/11028519/fd3c7b16_b.jpg",
				"https://exp.cdn-hotels.com/hotels/37000000/36390000/36384400/36384333/85f0f2fe_b.jpg",
				"https://exp.cdn-hotels.com/hotels/37000000/36390000/36384400/36384333/2a774fce_b.jpg",
				"https://exp.cdn-hotels.com/hotels/39000000/38400000/38399400/38399326/72396285_b.jpg");
		
		return roomimg;
	}
	public List<String> roomtypeList() {
		List<String> roomtype = Arrays.asList("스튜디오,퀸사이즈침대 1개","스튜디오,싱글침대 2개",
				"베이직룸",
				"aloft,룸,킹사이즈침대 1개,시내 전망","aloft,룸,싱글침대 2개,시내 전망",
				"패밀리룸","Quad Room",
				"스탠다드룸","디럭스룸",
				"공용 도미토리,여성 전용","공용 도미토리2,여성 전용",
				"시티룸,퀸사이즈침대 1개",
				"트윈룸","프렌즈룸",
				"스탠다드룸,금연","스탠다드룸,흡연",
				"더블룸 (한국인 투숙 불가)","쿼드룸 (한국인 투숙 불가)",
				"프라이빗 트윈룸 (내국인 투숙 불가)","객실,침대 6개 (내국인 투숙 불가)",
				"스튜디오 슈페리어 더블룸","스튜디오 슈페리어 트윈룸",
				"스탠다드 더블룸","비즈니스 트윈룸",
				"파비아 스탠다드 더블룸","파비아 스탠다드 트윈룸",
				"퍼시픽 디럭스 트윈룸",
				"드루와 스탠다드룸","드루와 디럭스룸",
				"Gloster기준 2인,추가 인원 요금 현장 결제","Melrose기준 2인,추가 인원 요금 현장 결제",
				"리츠 일반실");
		
		return roomtype;
	}
	 public List<Room> roomDB() {
		 Room room= null;
		 List<Room> roomList = new ArrayList<>();
		 for(int i = 0 ; i<hotelnameList().size();i++) {
			 room = new Room(hotelnameList().get(i),roomimgList().get(i),roomtypeList().get(i));
			 roomList.add(room);
			
		 }
		 
	  return roomList;
	 }
	 
		@Transactional
		public void insertRoomDB() {
			 List<Room> rList = roomDB();
			for(int i=0;i<rList.size();i++) {
				hotelMapper.insertRoom(rList.get(i));
			}
		
		}
	 
}
