package Data;

import DataService.CreditDataService;
import po.UserInfoPO;

public class CreditDataService_Stub implements CreditDataService{
	public boolean find(String id){
		System.out.println("find succeed!");
		return true;
	};
	public boolean add(String id, int credit){
		System.out.println("add succeed!");
		return true;
	};
	public boolean update(UserInfoPO po){
		System.out.println("update succeed!");
		return true;
	};
}
