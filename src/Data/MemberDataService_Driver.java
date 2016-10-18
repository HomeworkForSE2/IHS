package Data;

import DataService.MemberDataService;
import po.MemberPO;
import po.UserInfoPO;
public class MemberDataService_Driver {
	private MemberPO memberPO;
	
	public MemberDataService_Driver(){
		UserInfoPO user=new UserInfoPO("汤恩义","12345678","13888888888");
		memberPO=new MemberPO(user,"null","南大软院");
		
	}

	public void drive(MemberDataService memberDataService){
		memberDataService.insert(memberPO);
		memberDataService.update(memberPO);
		
	}
	public static void main(String[] args) {
		MemberDataService_Stub stub=new MemberDataService_Stub();
		MemberDataService_Driver driver=new MemberDataService_Driver();
		driver.drive(stub);
		
	
	}
}
