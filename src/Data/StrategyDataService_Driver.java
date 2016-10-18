package Data;

import DataService.StrategyDataService;
import po.StrategyPO;

public class StrategyDataService_Driver {
	
	 public static void main(String[] args){
		 StrategyDataService_Stub strategyDataService = new StrategyDataService_Stub();
		 StrategyDataService_Driver driver = new StrategyDataService_Driver();
	        driver.drive(strategyDataService);
	    }

	    public void drive(StrategyDataService strategyDataService){
	        StrategyPO inPO = new StrategyPO("2015-10-09");
	        StrategyPO inPO2 = new StrategyPO("Xinjiekou");
	        StrategyPO inPO3 = new StrategyPO("Xiaomi");
	        StrategyPO inPO4 = new StrategyPO("5");
	      
	        if(strategyDataService.updateDate(inPO))
	        	System.out.println("update succeed");
	        if(strategyDataService.updateArea(inPO2))
	        	System.out.println("update succeed");
	        if(strategyDataService.updateEnterprise(inPO3))
	        	System.out.println("update succeed");
	        if(strategyDataService.updateReservNum(inPO4))
	        	System.out.println("update succeed");
	    
	    }
}
