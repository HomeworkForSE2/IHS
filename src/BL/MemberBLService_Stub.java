package BL;

import BLService.MemberBLService;
import util.ResultMessage;

public class MemberBLService_Stub implements MemberBLService{
	
	
	public MemberBLService_Stub(){

	}
	
	@Override
	public ResultMessage initiaize(String ID, String PW, String callNumber) {
		// TODO Auto-generated method stub
		if(1<ID.length()&&ID.length()<=6&&6<=PW.length()&&PW.length()<=8&&callNumber.length()==11){		
			return new ResultMessage(true," ");
		}
		else{
			return new ResultMessage(false,"信息输入不合法");
			
		}
	}

	@Override
	public ResultMessage normalMember(String brithDate) {
		// TODO Auto-generated method stub
		return new ResultMessage(true,"注册普通会员成功");
	}

	@Override
	public ResultMessage enterpriseMember(String enterpriseName) {
		// TODO Auto-generated method stub
		if(enterpriseName.equals("华为")){
			return new ResultMessage(true,"注册企业会员成功");
		}else{
			return new ResultMessage(false,"注册企业会员失败");
		}
	}

	@Override
	public void endMember() {
		// TODO Auto-generated method stub
		System.out.println("End the member");
		
	}

}
