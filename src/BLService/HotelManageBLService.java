package BLService;


import vo.HotelInfoVO1;
import vo.HotelWorkerInfoVO;
import util.ResultMessage;
public interface HotelManageBLService {
	
	/**
	 * add hotel
	 * @param vo
	 * @return
	 */	
	public ResultMessage addHotel(HotelInfoVO1 vo);
	
	/**
	 * add hotelworker
	 * @param HotelName
	 * @param vo
	 * @return
	 */	
	public ResultMessage addHotelWorker(String HotelName,HotelWorkerInfoVO vo);
	
	/**
	 * 
	 */
	public void endHotelManage();
}
