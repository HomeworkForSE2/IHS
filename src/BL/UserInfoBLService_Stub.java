package BL;

import java.util.ArrayList;
import java.util.List;

import BLService.UserInfoBLService;
import util.ResultMessage;
import vo.CreditChangeVO;
import vo.HotelInfoVO1;
import vo.UserInfoVO;

public class UserInfoBLService_Stub implements UserInfoBLService{
	
	public List creditChangeList;
	public List hotelList;
	
	public UserInfoBLService_Stub(){
		creditChangeList=new ArrayList<>();
		hotelList=new ArrayList<>();
	}
	@Override
	public UserInfoVO showUserInfo(String ID) {
		// TODO Auto-generated method stub
		return new UserInfoVO(ID,null,null);
	}

	@Override
	public List<CreditChangeVO> showCreditRecord(String ID) {
		// TODO Auto-generated method stub
		return creditChangeList;
	}

	@Override
	public List<HotelInfoVO1> showReservedHotel(String ID) {
		// TODO Auto-generated method stub
		return hotelList;
	}

	@Override
	
	public ResultMessage modifyUserInfo(UserInfoVO vo) {
		// TODO Auto-generated method stub	
		return new ResultMessage(true,"修改用户信息成功");
		
	}

	@Override
	public void endUserInfo() {
		// TODO Auto-generated method stub
		System.out.println("End the UserInfo");
		
	}
	
	
	

}
