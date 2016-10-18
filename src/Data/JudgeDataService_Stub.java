package Data;

import DataService.JudgeDataService;
import po.StrategyPO;

public class JudgeDataService_Stub implements JudgeDataService {
	public boolean updateStar(int star){
		System.out.println("update succeed!");
		return true;
	};
	public boolean updateEvaluation(String evaluation){
		System.out.println("update succeed!");
		return true;
	};
	public boolean findHotel(String status){
		System.out.println("find succeed!");
		return true;
	};
}
