package DataService;

import po.StrategyPO;
import util.ResultMessage;

public interface StrategyDataService {
	public boolean updateDate(StrategyPO po);
	public boolean updateArea(StrategyPO po);
	public boolean updateEnterprise(StrategyPO po);
	public boolean updateReservNum(StrategyPO po);
	public boolean find(StrategyPO po);
	
}
