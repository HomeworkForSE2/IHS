package BL;

import BLService.HotelInfoBLService;
import vo.HotelInfoVO1;

public class HotelInfoBLService_Stub implements HotelInfoBLService {
       int hoteladdress;
       int hotelBD;
       int hotelStars;
       int hotelIntro;
       int hotelFaci;
       int hotelName;
       
       public HotelInfoBLService_Stub (int ha,int hBD,int hs,int hi,int hf){
    	   hoteladdress=ha;
            hotelBD=hBD;
            hotelStars=hs;
            hotelIntro=hi;
            hotelFaci=hf;
           
       }
	
		public HotelInfoBLService_Stub() {
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated method stub
		public void hotelInfoRefresh(HotelInfoVO1 vo){
			System.out.println("hotelInfoRefresh  succeed !");
		}
		public void endInfo(){
			System.out.println("hotelInfoRfresh end !");
		}
	}


