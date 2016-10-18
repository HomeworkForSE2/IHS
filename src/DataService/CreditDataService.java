package DataService;

import po.UserInfoPO;
import util.ResultMessage;

public interface CreditDataService {
	public boolean find(String id);
	public boolean add(String id, int credit);
	public boolean update(UserInfoPO po);
}
