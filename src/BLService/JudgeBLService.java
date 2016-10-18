package BLService;

import java.util.ArrayList;

import util.ResultMessage;
import vo.HotelVO;

public interface JudgeBLService {
	public ArrayList<HotelVO> viewHotelList(String status);
	
	public void selectHotel();
	
	public ResultMessage setStar(int stars);
	
	public ResultMessage setEvaluation(String evaluation);
	
	public void endJudge();
	
}
