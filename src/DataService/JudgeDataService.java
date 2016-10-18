package DataService;

import util.ResultMessage;

public interface JudgeDataService {
	public boolean updateStar(int star);
	public boolean updateEvaluation(String evaluation);
	public boolean findHotel(String status);
}
