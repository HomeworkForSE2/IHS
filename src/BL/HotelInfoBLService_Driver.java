package BL;

import vo.HotelInfoVO1;

public class HotelInfoBLService_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelInfoBLService_Stub a=new HotelInfoBLService_Stub();
		HotelInfoBLService_Driver b=new HotelInfoBLService_Driver();
		b.drive(a);
	}

	private void drive(HotelInfoBLService_Stub a) {
		// TODO Auto-generated method stub
		HotelInfoVO1 refreshHotelInfovo=new HotelInfoVO1("seasidehotel","nanjingxianling","xianlinguniversities",5,"pool","nice");
		a.hotelInfoRefresh(refreshHotelInfovo);
		a.endInfo();
		 
	}

}
