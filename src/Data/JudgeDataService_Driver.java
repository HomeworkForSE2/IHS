package Data;

import DataService.JudgeDataService;
import po.StrategyPO;

public class JudgeDataService_Driver {
	public static void main(String[] args){
		JudgeDataService_Stub judgeDataService = new JudgeDataService_Stub();
		JudgeDataService_Driver driver = new JudgeDataService_Driver();
	        driver.drive(judgeDataService);
	    }

	    public void drive(JudgeDataService judgeDataService){
	       
	        if(judgeDataService.updateStar(4))
	        	System.out.println("update succeed");
	        if(judgeDataService.updateEvaluation("this place is sucks"))
	        	System.out.println("update succeed");
	        if(judgeDataService.findHotel("already executed hotel"))
	        	System.out.println("find succeed");
	       
	    }
}
