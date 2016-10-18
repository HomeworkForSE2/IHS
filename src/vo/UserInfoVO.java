package vo;

public class UserInfoVO {
	private String name;
	private String password;
	private String callNumber;
	
	public UserInfoVO(){
		
	}
	public UserInfoVO(String name,String password,String callNumber){
		this.name=name;
		this.password=password;
		this.callNumber=callNumber;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getPassword(){
		return this.password;
	}

	public String getCallNumber(){
		return this.callNumber;
	}
	
	

}
