package BL;

import vo.HotelInfoVO1;
import vo.HotelWorkerInfoVO;
import BLService.HotelManageBLService;
import util.ResultMessage;
public class HotelManageBLService_Driver {
	
	public void drive(HotelManageBLService hotelManageBLService){
		HotelInfoVO1 hotelInfoVO=new HotelInfoVO1("格林豪泰",null,null,0,null,null);
		HotelWorkerInfoVO hotelWorkerInfoVO=new HotelWorkerInfoVO("汤恩义","12345678","13888888888");
		ResultMessage result1=hotelManageBLService.addHotel(hotelInfoVO);
		ResultMessage result2=hotelManageBLService.addHotelWorker("格林豪泰", hotelWorkerInfoVO);
		if(result1.isPass()){
			System.out.println("添加酒店成功");
		}else{
			System.out.println("添加酒店失败");
		}
		
		if(result1.isPass()){
			System.out.println("添加酒店工作人员成功");
		}else{
			System.out.println("添加酒店工作人员失败");
		}
	}
	
	public static void main(String[] args) {
		HotelManageBLService_Driver driver=new HotelManageBLService_Driver();
		HotelManageBLService_Stub stub=new HotelManageBLService_Stub();
		driver.drive(stub);
	}

}
