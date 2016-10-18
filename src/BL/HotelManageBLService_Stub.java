package BL;

import vo.HotelInfoVO1;
import vo.HotelWorkerInfoVO;
import BLService.HotelManageBLService;
import util.ResultMessage;
public class HotelManageBLService_Stub implements HotelManageBLService{
	HotelInfoVO1 hotel;
	
	public HotelManageBLService_Stub() {
		// TODO Auto-generated constructor stub
		hotel=new HotelInfoVO1("格林豪泰",null,null,0,null,null);
	}
	
	@Override
	public ResultMessage addHotel(HotelInfoVO1 vo) {
		// TODO Auto-generated method stub
		if(vo.getHotelName().equals(this.hotel.getHotelName())){
			return new ResultMessage(false,"该酒店已存在");
		}else{
			return new ResultMessage(true,"添加酒店成功");
		}
		
	}

	@Override
	public ResultMessage addHotelWorker(String HotelName, HotelWorkerInfoVO vo) {
		// TODO Auto-generated method stub
		if(!HotelName.equals(this.hotel.getHotelName())){
			return new ResultMessage(false,"该酒店不存在");
		}else if(HotelName.equals(this.hotel.getHotelName())&&this.hotel.hasW()==true){
			return new ResultMessage(false,"该酒店已存在酒店工作人员");
		}else{
			return new ResultMessage(true,"添加酒店工作人员成功");
		}
	}

	@Override
	public void endHotelManage() {
		// TODO Auto-generated method stub
		System.out.println("End the HotelManage");
	}

}
