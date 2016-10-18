package BL;


import BLService.CreditBLService;
import util.ResultMessage;
import vo.UserInfoVO;

public class CreditBLService_Driver {
	public void drive(CreditBLService service){
		UserInfoVO user = new UserInfoVO("George","12345","1000");
		ResultMessage result1 = service.viewUser("George");
		ResultMessage result2 = service.addCredit(9);
		if(result1.isPass()){
			System.out.println("exist");
		}else{
			System.out.println("id has a typo");
		}
		
		if(result2.isPass()){
			System.out.println("credit added sucessfully");
		}else{
			System.out.println("fail add credit");
		}
		
		
	}
	
	public static void main(String[] args){
		CreditBLService_Driver driver = new CreditBLService_Driver();
		CreditBLService_Stub stub = new CreditBLService_Stub();
		driver.drive(stub);
	}
}
