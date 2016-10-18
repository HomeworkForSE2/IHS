package Data;

import DataService.HotelManageDataService;
import po.HotelInfoPO;
import po.HotelWorkerInfoPO;
public class HotelManageDataService_Stub implements HotelManageDataService{

	@Override
	public void addHotel(HotelInfoPO po) {
		// TODO Auto-generated method stub
		System.out.println("AddHotel succeed!");
	}

	@Override
	public void addHotelWorker(HotelWorkerInfoPO po) {
		// TODO Auto-generated method stub
		System.out.println("AddHotelWorker succeed!");
	}

	@Override
	public HotelInfoPO find(String ID) {
		// TODO Auto-generated method stub
		System.out.println("Find succeed!");
		return new HotelInfoPO(null,null,null,0,null,null);
	}

	@Override
	public void update(HotelInfoPO po) {
		// TODO Auto-generated method stub
		System.out.println("Update succeed!");
	}

}
