package BLService;
import util.ResultMessage;

public interface MemberBLService {
	
	

	/**
	 * initiaize user information
	 * @param ID
	 * @param PW
	 * @param callNamber
	 * @return
	 */
	public ResultMessage initiaize(String ID,String PW,String callNamber);
	
	
	/**
	 * register normal member
	 * @param date
	 * @return
	 */
	public ResultMessage normalMember(String date);
	
	
	/**
	 * register enterprise member
	 * @param enterpriseName
	 * @return
	 */
	public ResultMessage enterpriseMember(String enterpriseName);
	
	
	/**
	 * 
	 */
	public void endMember();
}
