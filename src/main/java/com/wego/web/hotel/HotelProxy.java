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
public class HotelProxy {
	@Autowired HotelMapper hotelMapper;
	
	public List<String> hotelnameList() {
		List<String> hotelname = Arrays.asList("플레이저 프레이스 센트럴 서울","리오 모텔","알로프트 서울 강남",
				"아이하우스 친친","한옥 레지던스 호텔 사이드","류게스트하우스","남산 포레스트 시티","디 원 호스텔","오슬로 모텔 방배",
				"오아시스 게스트하우스 서울","리안 게스트하우스 호스텔","오크우드 프리미어 인천","호텔 엠스토리","호텔 파비아","수원 퍼시픽 호텔","두루와 호텔","사과꽃향기 펜션","리츠모텔");
		
		return hotelname;
	}
	
	public List<Double> ratingList(){
		List<Double> rating = Arrays.asList(8.6,5.4,8.6,8.0,6.4,9.4,5.2,8.0,4.0,5.5,9.2,9.2,7.0,7.2,6.4,7.6,5.4,5.5);
		
		return rating;
		
	}
	public List<String> hidList(){
		List<String> hid = Arrays.asList("센트럴서울","리오","알로프트","친친","한옥사이드","류게스트","포레스트","디 원 호스텔","오슬로",
				"오아시스","리안","오크우드인천","엠스토리","피비아","수원퍼시픽","드루와","사과꽃향기","리츠");
		
		return hid;
		
	}
	public List<String> commentsList(){
		List<String> comments = Arrays.asList("강아지데리고가서 해먹으면서 놀기에는 최고에요. 룸컨디션도 나쁘지않고, 스텝들도 엄청친절해요",
				"반려동물과 함께 가족 숙박으로 좋은 선택이었어요.",
				"깨끗하고 필요한거 원하는거 빠르게 해결해줌",
				"가성비 대비 방싸이즈 주방 세탁기구비 등등 만족하고 특히 투숙객 사우나 무료이용이 출장객한테는 하루 피로를 풀수있는 좋은 기회인거 같습니다",
				"깨끗하고 안락한 숙박시설",
				"합리적이며 편안한 숙박지이었어요... 사우나가 있어서 합리적인 숙박지로 이용을 하고있음",
				"깔끔한 객실과 친절한 서비스",
				"편의시설이 잘 되어있고 숙소 또한 깨끗하고 편리하게 이용할 수있도록 되어있었어요...그리고 직원분들이 친절하셨어요^^!!",
				"방은 넓고 쾌적하였습니다",
				"넓고 좋았어요 치약이 부족했던 점 제외하고는 괜찮았아요","시설이 낡은거 외엔 다 편리합니다. 가격대비 가성비 좋아요",
				"셀수없을정도로 자주 이용하는 곳입니다. 이번에도 전반적으로 전부 만족스러웠습니다",
				"다들 너무 좋다고 겨울오기전에 또 가기로 했어요",
				"제가 약간 귀찮은 요구를 했었는데도 친절하게 응대해 주셔서 너무 감사했습니다","좋아요",
				"위치가 너무너무 좋지만.. 커피포트 같은 건 관리가 됐으면 좋겠어요","고양이, 강아지 데리고 놀러갔는데 좋았어요",
				"반려동물과 함께 자주 찾는 곳이고, 앞으로 더 자주 찾을 것 같아요.");
		
		return comments;
		
	}

	public List<String> hotelimgList(){
		List<String> hotelimg = Arrays.asList("https://thumbnails.trvl-media.com/pZGTUCggmVnbZwoSCtyxHsCyPGk=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/2000000/1530000/1528600/1528555/e06f2580_z.jpg",
				"https://thumbnails.trvl-media.com/cOQH_A0GowPz9Qd_agODMi7BMMg=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/40000000/39760000/39757400/39757330/86df6c02_z.jpg",
				"https://thumbnails.trvl-media.com/iark7ZWtcEnr0-_1T2dJR0iFgq0=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/9000000/8770000/8762900/8762820/18f5ee33_z.jpg",
				"https://thumbnails.trvl-media.com/bQznuEocTfA1BHcEVtkenmnbayo=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/11000000/10640000/10630800/10630729/6f697f23_z.jpg",
				"https://thumbnails.trvl-media.com/Hg9X5ENRfN8ZXDq_X68B0GwtkH0=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/17000000/16270000/16267100/16267029/7e3d0b9d_z.jpg",
				"https://thumbnails.trvl-media.com/f9qaWrsN-PESb80twrKtSjSDcdg=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/16000000/15160000/15157500/15157404/8af1c158_z.jpg",
				"https://thumbnails.trvl-media.com/csFIOJ4I9KOvwnMKWrzv6sbBz_8=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/34000000/33070000/33064700/33064680/976cbcbd_z.jpg",
				"https://thumbnails.trvl-media.com/HnafFq0iRBT-XIzal_PI9w3p_SI=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/12000000/11020000/11017800/11017715/b4604243_z.jpg",
				"https://thumbnails.trvl-media.com/rUqPujWrZ5p_deEWd3O5Iw1B-mo=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/37000000/36350000/36344100/36344074/f8ea5418_z.jpg",
				"https://thumbnails.trvl-media.com/3FQVueksJaf5P4Kob3qHxsN-Mac=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/42000000/41990000/41985200/41985178/ba674112_z.jpg",
				"https://thumbnails.trvl-media.com/BAMaZN2A9lEfWSaGVA_b6gA2-V4=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/13000000/12610000/12601100/12601009/2e7ec6db_z.jpg",
				"https://thumbnails.trvl-media.com/6l_7Sy9VaPv4hNa2O518_rsupCA=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/9000000/8330000/8322700/8322634/70904ae5_z.jpg",
				"https://thumbnails.trvl-media.com/BIz7hurY-DwZS7szzNueoIV1iM4=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/19000000/18600000/18597300/18597296/11cced57_z.jpg",
				"https://thumbnails.trvl-media.com/g-wsVRPoJmdH2QrUv8Ka3Wbfyj4=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/3000000/2180000/2179400/2179398/2db7df22_z.jpg",
				"https://thumbnails.trvl-media.com/M2XQs14tAgLcPD3a9cU_683bYeE=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/11000000/10660000/10659700/10659601/3f88ab9d_z.jpg",
				"https://thumbnails.trvl-media.com/LoooH-9s0hnPOdFnpL8iakCL0FU=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/12000000/11030000/11028600/11028519/7f074d73_z.jpg",
				"https://thumbnails.trvl-media.com/Rt-O75Wkq0Qx173USOGc0eojpsw=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/37000000/36390000/36384400/36384333/29d12c5b_z.jpg",
				"https://thumbnails.trvl-media.com/X0lUcYdJvqMucruzIlkG4js018c=/154x84/smart/filters:quality(60)/images.trvl-media.com/hotels/39000000/38400000/38399400/38399326/61d9569d_z.jpg");
		
		return hotelimg;
		
	}
	public List<Integer> priceList(){
		List<Integer> price = Arrays.asList(93397,47273,95000,52364,90909,36091,40909,53273,45455,63636,59091,160000,32728,41322,49587,36364,35455,36364);
		
		return price;
		
	}
	public List<String> haddrList(){
		List<String> haddr = Arrays.asList("중구 통일로 78,서울특별시,대한민국",
				"동대문구 회기로29길 5,191-20,서울특별시,02445,대한민국",
				"영동대로 736,강남구,서울특별시,135-957,대한민국",
				"연남로7길 24-11,마포구,서울특별시,121867,대한민국",
				"종로구 필운대로 27-5,서울특별시,03039,대한민국",
				"강남구 논현로159길 22,서울특별시,06018,대한민국",
				"중구 퇴계로24길 13-8,서울특별시,04629,대한민국",
				"독막로9길 43,서울특별시,121-895,대한민국",
				"서초구 동광로 49,서울특별시,06561,대한민국",
				"마포구 와우산로29가길 12,서울특별시,04053,대한민국",
				"서교동 331-18 성우빌딩 4층,마포구,서울특별시,대한민국",
				"컨벤시아대로 165,인천광역시,21998,대한민국",
				"팔달구 효원로291번길 22,수원시,경기도,16488,대한민국",
				"원미구 심곡동 139-14,부천시,경기도,420-822,대한민국",
				"효원로235번길 38,팔달구,수원시,경기도,442-834,대한민국",
				"부평구 시장로12번길 31,부평구,인천광역시,21395,대한민국",
				"상면 수목원로 333,사과꽃향기 펜션,가평군,경기도,12448,대한민국",
				"봉성로5번길 8,군포시,경기도,15855,대한민국");
		
		return haddr;
		
	}
	

	
	 public List<Hotel> hotelDB() {
		 Hotel hotel= null;
		 List<Hotel> hotelList = new ArrayList<>();
		 for(int i = 0 ; i<hotelnameList().size();i++) {
			 hotel = new Hotel(hotelnameList().get(i),ratingList().get(i),hidList().get(i),commentsList().get(i),hotelimgList().get(i),priceList().get(i),haddrList().get(i));
			 hotelList.add(hotel);
			
		 }
		 
	  return hotelList;
	 }
	 
		
		@Transactional
		public void insertHotelDB() {
			 List<Hotel> hList = hotelDB();
			for(int i=0;i<hList.size();i++) {
				hotelMapper.insertHotel(hList.get(i));
			}
		
		}
	 
	
}
