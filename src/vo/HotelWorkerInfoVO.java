package vo;

public class HotelWorkerInfoVO extends UserInfoVO{
	private String name;
	private String password;
	private String callNumber;
	
	public HotelWorkerInfoVO(){
		
	}
	public HotelWorkerInfoVO(String name,String password,String callNumber){
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
