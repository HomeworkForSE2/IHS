package BLService;
import vo.HotelInfoVO1;
import vo.UserInfoVO;
import vo.CreditChangeVO;

import java.util.List;

import util.ResultMessage;

public interface UserInfoBLService {
	/**
	 * 
	 * @param ID
	 * @return
	 */
	public UserInfoVO showUserInfo(String ID);
	
	/**
	 * 
	 * @param ID
	 * @return
	 */
	public List<CreditChangeVO> showCreditRecord(String ID);
	
	/**
	 * 
	 * @param ID
	 * @return
	 */
	public List<HotelInfoVO1> showReservedHotel(String ID);
	
	/**
	 * 
	 * @param vo
	 * @return
	 */
	public ResultMessage modifyUserInfo(UserInfoVO vo);
	
	/**
	 * 
	 */
	public void endUserInfo();

}
