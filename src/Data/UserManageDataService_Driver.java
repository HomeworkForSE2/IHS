package Data;
import DataService.UserManageDataService;
import po.UserInfoPO;
public class UserManageDataService_Driver {
		
	private UserInfoPO userInfoPO;
	
	public UserManageDataService_Driver(){
		userInfoPO=new UserInfoPO("刘钦","12345678","13888888888");
	}
		
	public void drive(UserManageDataService userManageDataService){
		userManageDataService.find("小明");
		userManageDataService.update(userInfoPO);
		userManageDataService.add(userInfoPO);
	}
	public static void main(String[] args) {
		UserManageDataService_Stub stub=new UserManageDataService_Stub();
		UserManageDataService_Driver driver=new UserManageDataService_Driver();
		driver.drive(stub);
	}

}
