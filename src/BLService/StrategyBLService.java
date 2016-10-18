package BLService;

import util.ResultMessage;
import vo.strategyVO;

public interface StrategyBLService {
	public strategyVO viewStrategy();
	
	public ResultMessage setDate(String start, String end, double discount);
	
	public ResultMessage setArea(String area, double discount);
	
	public ResultMessage setCredit(int credit);
	
	public ResultMessage setBirthday(int month, int day, double discount);
	
	public ResultMessage setEnterprise(String enterprise, double discount);
	
	public ResultMessage setReservNum(int num, double discount);
	
	public void endStrategy();
	
}
