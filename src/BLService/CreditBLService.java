package BLService;

import util.ResultMessage;
import vo.UserInfoVO;

public interface CreditBLService {
	
	public ResultMessage viewUser(String id);
	
	public ResultMessage addCredit(int credit);
	
	public void endCredit();

}
