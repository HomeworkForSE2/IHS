package BLService;
import vo.UserInfoVO;
import util.ResultMessage;
public interface UserManageBLService {
	/**
	 * search user information
	 * @param ID
	 * @param userType
	 * @return
	 */	
	public UserInfoVO searchUserInfo(String ID);

	/**
	 * modify user information
	 * @param vo
	 * @return
	 */
	public ResultMessage modifyUserInfo(UserInfoVO vo);
	
	/**
	 * add websiteworker
	 * @param vo
	 * @return
	 */
	public ResultMessage addWebsiteWorker(UserInfoVO vo);
	
	
	public void endUserManage();
}
