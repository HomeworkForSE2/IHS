package po;

public class MemberPO {
	UserInfoPO user;
	String date;
	String enterprise;
	public MemberPO(UserInfoPO user,String date,String enterprise){
		this.user=user;
		this.date=date;
		this.enterprise=enterprise;
	}
	public String getDate(){
		return this.date;
	}
	public String getEnterprise(){
		return this.enterprise;
	}

	public UserInfoPO getUserInfo(){
		return this.user;
	}
}
