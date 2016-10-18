package BL;

import vo.UserInfoVO;
import BLService.UserManageBLService;
import util.ResultMessage;

public class UserManageBLService_Stub implements UserManageBLService{

	UserInfoVO user;
	UserInfoVO websiteWorker;
	public UserManageBLService_Stub() {
		// TODO Auto-generated constructor stub
		user=new UserInfoVO();
		websiteWorker=new UserInfoVO();
	}
	
	@Override
	public UserInfoVO searchUserInfo(String ID) {
		// TODO Auto-generated method stub
			return new UserInfoVO(ID,null,null);
		
	}

	@Override
	public ResultMessage modifyUserInfo(UserInfoVO vo) {
		// TODO Auto-generated method stub
		if(!this.user.getName().equals(vo.getName())){
			return new ResultMessage(false,"该用户不存在");
		}else{
			return new ResultMessage(true,"修改用户信息成功");
		}
	}

	@Override
	public ResultMessage addWebsiteWorker(UserInfoVO vo) {
		// TODO Auto-generated method stub
		if(this.websiteWorker.getName().equals(vo.getName())){
			return new ResultMessage(false,"该网站营销人员已存在");
		}else{
			return new ResultMessage(true,"添加网站营销人员成功");
		}
		
	}

	public void endUserManage(){
		System.out.println("End the UserManage");
	}

}
