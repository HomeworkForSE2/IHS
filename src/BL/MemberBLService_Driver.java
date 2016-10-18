package BL;

import BLService.MemberBLService;
import util.ResultMessage;
public class MemberBLService_Driver {
	public void drive(MemberBLService memberBLService){
		String ID="王浩然";
		String PW="12345678";
		String callNumber="13888888888";
		String brithDate="19770101";
		String enterprise="南大软院";
		ResultMessage result1=memberBLService.initiaize(ID, PW, callNumber);
		ResultMessage result2=memberBLService.normalMember(brithDate);
		ResultMessage result3=memberBLService.enterpriseMember(enterprise);
		
		if(result1.isPass()){
			System.out.println("初始化个人信息成功");
		}else{
			System.out.println("初始化个人信息失败");
			
		}
		
		if(result2.isPass()){
			System.out.println("注册普通会员成功");
		}else{
			System.out.println("注册普通会员失败");
		}

		if(result3.isPass()){
			System.out.println("注册企业会员成功");
		}else{
			System.out.println("注册企业会员失败");
		}
	}
	
	public static void main(String[] args) {
		MemberBLService_Driver driver=new MemberBLService_Driver();
		MemberBLService_Stub stub=new MemberBLService_Stub();
		driver.drive(stub);
	}
	

}
