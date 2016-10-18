package BL;

import java.util.ArrayList;

import BLService.JudgeBLService;
import util.ResultMessage;
import vo.HotelVO;

public class JudgeBLService_Stub implements JudgeBLService {
	public ArrayList<HotelVO> viewHotelList(String status){
		
		return new ArrayList<HotelVO>();
	};
	
	public void selectHotel(){
		
		System.out.println("Hotel selected");
	};
	
	public ResultMessage setStar(int stars){
		if(stars>=6&&stars<1){
			return new ResultMessage(false,"star should be between 1 to 5");
		}else
		return new ResultMessage(true,"set up star successfully");
	};
	
	public ResultMessage setEvaluation(String evaluation){
		if(evaluation.length()>140){
			return new ResultMessage(false,"you can't evaluation over 140 words ");
		}else
		return new ResultMessage(true,"set up evaluation successfully");
	};
	
	public void endJudge(){
		
		System.out.println("End the setting judge!");
	};
}
