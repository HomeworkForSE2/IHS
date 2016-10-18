package BL;

import BLService.UserInfoBLService;
import vo.UserInfoVO;

public class UserInfoBLService_Driver {

	public void drive(UserInfoBLService userInfoBLService){
		String ID="张田田";
		UserInfoVO userInfoVO=new UserInfoVO("张田田","12345678","13888888888");
		if(userInfoBLService.showUserInfo(ID)!=null){
			System.out.println("查询成功");
		}else{
			System.out.println("查询失败");
		}
		
		if(userInfoBLService.showCreditRecord(ID)!=null){
			System.out.println("查询成功");
		}else{
			System.out.println("查询失败");
		}
		
		if(userInfoBLService.showReservedHotel(ID)!=null){
			System.out.println("查询成功");
		}else{
			System.out.println("查询失败");
		}
		
		if(userInfoBLService.modifyUserInfo(userInfoVO).isPass()){
			System.out.println(" 修改成功");
		}else{
			System.out.println(" 修改失败");
		}
		
	}
	
	
	public static void main(String[] args) {
		UserInfoBLService_Driver driver=new UserInfoBLService_Driver();
		UserInfoBLService_Stub stub=new UserInfoBLService_Stub();
		driver.drive(stub);
	}
}
