package Data;

import DataService.UserInfoDataService;

public class UserInfoDataService_Driver {

	
	public UserInfoDataService_Driver(){
		
	}
		
	public void drive(UserInfoDataService userInfoDataService){
		String ID="小明";
		
		if(userInfoDataService.find(ID)!=null){
			System.out.println("查找成功");
		}else{
			System.out.println("查找失败");
		}
		
	}
	public static void main(String[] args) {
		UserInfoDataService_Stub stub=new UserInfoDataService_Stub();
		UserInfoDataService_Driver driver=new UserInfoDataService_Driver();
		driver.drive(stub);
	}
	
	
}
