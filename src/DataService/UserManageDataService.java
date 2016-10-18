package DataService;
import po.UserInfoPO;

public interface UserManageDataService {
	
	/**
	 * find
	 * @param ID
	 * @param userType
	 * @return
	 */
	public UserInfoPO find(String ID);
	
	
	/**
	 * update
	 * @param po
	 */
	public void update(UserInfoPO po);
	
	
	/**
	 * add
	 * @param po
	 */
	public void add(UserInfoPO po);

}
