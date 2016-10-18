package DataService;
import po.HotelInfoPO;
import po.HotelWorkerInfoPO;

public interface HotelManageDataService {

	/**
	 * add
	 * @param po
	 */
	public void addHotel(HotelInfoPO po);
	
	/**
	 * add
	 * @param po
	 */
	public void addHotelWorker(HotelWorkerInfoPO po);
	
	/**
	 * find
	 * @param ID
	 * @return
	 */
	public HotelInfoPO find(String ID);
	
	/**
	 * updata
	 * @param po
	 */
	public void update(HotelInfoPO po);
}
