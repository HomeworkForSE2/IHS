package BL;

import BLService.StrategyBLService;
import util.ResultMessage;
import vo.strategyVO;

public class StrategyBLService_Stub implements StrategyBLService  {
	strategyVO strategy;
	
	public StrategyBLService_Stub(){
		strategy= new strategyVO();
	}
	
	public strategyVO viewStrategy(){
		
		return strategy;
	};
	
	public ResultMessage setDate(String start, String end, double discount){
		
		return new ResultMessage(true,"double 11 discount set up successfully");
	};
	
	public ResultMessage setArea(String area, double discount){
		
		
		return new ResultMessage(true,"Commercial Area discount set up successfully");
	};
	
	public ResultMessage setCredit(int credit){
		
		
		return new ResultMessage(true,"credit set up successfully");
	};
	
	public ResultMessage setBirthday(int month, int day, double discount){
		
		
		return new ResultMessage(true,"Birthday discount set up successfully");
	};
	
	public ResultMessage setEnterprise(String enterprise, double discount){
		
		return new ResultMessage(true,"Enterprise discount set up successfully");
	};
	
	public ResultMessage setReservNum(int num, double discount){
		
		if(num<3){
			return new ResultMessage(false,"more than 3 room reservation");
		}else{
		return new ResultMessage(true,"Over 3 room reservation set up");
		}
		
	};
	
	public void endStrategy(){
		
		
		System.out.println("End the setting strategy!");
	};
}
