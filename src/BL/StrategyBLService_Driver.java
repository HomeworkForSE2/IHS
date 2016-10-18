package BL;



import BLService.StrategyBLService;
import util.ResultMessage;
import vo.strategyVO;

public class StrategyBLService_Driver {
	public void drive(StrategyBLService service){
		strategyVO strategy = new strategyVO();
		strategy.setDouble11("11-10", "11-12", "30.0");
		
		ResultMessage result1 = service.setDate("11-10", "11-12", 30.0);
		ResultMessage result2 = service.setArea("Xinjiekou", 20.0);
		ResultMessage result3 = service.setBirthday(12,13,20.0);
		ResultMessage result4 = service.setEnterprise("Xiaomi",20.0);
		ResultMessage result5 = service.setReservNum(3,20.0);
		if(result1.isPass()){
			System.out.println("double 11 discount set up sucessfully");
		}else{
			System.out.println("double 11 discount set up falied");
		}
		
		if(result2.isPass()){
			System.out.println("VIP discount set up sucessfully");
		}else{
			System.out.println("VIP discount set up falied");
		}
		
		if(result3.isPass()){
			System.out.println("Birthday discount set up sucessfully");
		}else{
			System.out.println("Birthday discount set up falied");
		}
		
		if(result4.isPass()){
			System.out.println("Enterprise discount set up sucessfully");
		}else{
			System.out.println("Enterprise discount set up falied");
		}
		
		if(result5.isPass()){
			System.out.println("ReservNum discount set up sucessfully");
		}else{
			System.out.println("ReservNum discount set up falied");
		}
	}
	
	public static void main(String[] args){
		StrategyBLService_Driver driver = new StrategyBLService_Driver();
		StrategyBLService_Stub stub = new StrategyBLService_Stub();
		driver.drive(stub);
	}
		
		
}
