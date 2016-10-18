package DataService;

import po.UserInfoPO;
public interface UserInfoDataService {

	/**
	 * 
	 * @param ID
	 * @return
	 */
	public UserInfoPO find(String ID);
}
