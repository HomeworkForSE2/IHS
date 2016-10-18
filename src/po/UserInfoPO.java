package po;

public class UserInfoPO {
	private String name;
	private String password;
	private String callNumber;
	
	public UserInfoPO(){
		
	}
	public UserInfoPO(String name,String password,String callNumber){
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
