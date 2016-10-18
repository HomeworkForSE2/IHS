package BL;
import vo.UserInfoVO;
import BLService.UserManageBLService;
import util.ResultMessage;

public class UserManageBLService_Driver {
	public void drive(UserManageBLService userManageBLService){
		String ID="张田田";
		UserInfoVO userInfoVO=new UserInfoVO("张田田","12345678","13888888888");
		ResultMessage result1=userManageBLService.addWebsiteWorker(userInfoVO);
		ResultMessage result2=userManageBLService.modifyUserInfo(userInfoVO);
		if(userManageBLService.searchUserInfo("张田田")!=null){
			System.out.println("查询成功");
		}else{
			System.out.println("不存在");
		}
		
		if(result1.isPass()){
			System.out.println("添加网站营销人员成功");
		}else{
			System.out.println("添加网站营销人员失败");
		}
		
		if(result2.isPass()){
			System.out.println("修改用户信息成功");
		}else{
			System.out.println("修改用户信息失败");
		}
	}
	
	public static void main(String[] args) {
		UserManageBLService_Driver driver=new UserManageBLService_Driver();
		UserManageBLService_Stub stub=new UserManageBLService_Stub();
		driver.drive(stub);
	}
	

}
