package BL;

import BLService.CreditBLService;
import util.ResultMessage;
import vo.UserInfoVO;

public class CreditBLService_Stub implements CreditBLService {
	
	UserInfoVO user;
	
	public CreditBLService_Stub(){
		user = new UserInfoVO("George","12345","1000");
	}
	 
	public ResultMessage viewUser(String id){
		if(!user.getName().equals(id)){
			return new ResultMessage(false,"id has a typo");
		}else{
			return new ResultMessage(true," ");
		}
		
	};
	
	public ResultMessage addCredit(int credit){
		if(credit>10){
			return new ResultMessage(false,"Credit can not over 10");
		}else{
			return new ResultMessage(true,"Credit added succesfully");
		}
	};
	
	public void endCredit(){
		
		System.out.println("End the charging credit!");
	};
	
}
