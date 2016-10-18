package Data;
import DataService.UserManageDataService;
import po.UserInfoPO;
public class UserManageDataService_Stub implements UserManageDataService{

	@Override
	public UserInfoPO find(String ID) {
		// TODO Auto-generated method stub
		System.out.println("Find succeed");
		return new UserInfoPO();
	}

	@Override
	public void update(UserInfoPO po) {
		// TODO Auto-generated method stub
		System.out.println("Update succeed");
	}

	@Override
	public void add(UserInfoPO po) {
		// TODO Auto-generated method stub
		System.out.println("Add succeed");
		
	}

}
