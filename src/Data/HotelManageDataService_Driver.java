package Data;

import po.HotelWorkerInfoPO;
import DataService.HotelManageDataService;
import po.HotelInfoPO;
public class HotelManageDataService_Driver {
	private HotelInfoPO hotelInfoPO;
	private HotelWorkerInfoPO hotelWorkerInfoPO;
	
	public HotelManageDataService_Driver(){
		hotelInfoPO=new HotelInfoPO("格林豪泰",null,null,0,null,null);
		hotelWorkerInfoPO =new HotelWorkerInfoPO("丁二玉","12345678","13888888888");
	}
	public void drive(HotelManageDataService hotelManageDataService){
		hotelManageDataService.addHotel(hotelInfoPO);
		hotelManageDataService.addHotelWorker(hotelWorkerInfoPO);
		hotelManageDataService.find("南大旅馆");
		hotelManageDataService.update(hotelInfoPO);
		
	}
	public static void main(String[] args) {
		HotelManageDataService_Stub stub=new HotelManageDataService_Stub();
		HotelManageDataService_Driver driver=new HotelManageDataService_Driver();
		driver.drive(stub);
	}
}
