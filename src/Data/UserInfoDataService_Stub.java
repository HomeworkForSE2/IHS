package Data;

import DataService.UserInfoDataService;
import po.UserInfoPO;

public class UserInfoDataService_Stub implements UserInfoDataService{

	@Override
	public UserInfoPO find(String ID) {
		// TODO Auto-generated method stub
		System.out.println("Find succeed");
		return new UserInfoPO();
	}

}
