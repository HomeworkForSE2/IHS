package Data;

import DataService.StrategyDataService;
import po.StrategyPO;

public class StrategyDataService_Stub implements StrategyDataService {
	public boolean updateDate(StrategyPO po){
		System.out.println("update succeed!");
		return true;
	};
	public boolean updateArea(StrategyPO po){
		System.out.println("update succeed!");
		return true;
	};
	public boolean updateEnterprise(StrategyPO po){
		System.out.println("update succeed!");
		return true;
	};
	public boolean updateReservNum(StrategyPO po){
		System.out.println("update succeed!");
		return true;
	};
	public boolean find(StrategyPO po){
		System.out.println("find succeed!");
		return true;
	};
}
