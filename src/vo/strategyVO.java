package vo;

public class strategyVO {
	private String startDate;
	private String endDate;
	private String commercialArea;
	private String credit;
	private String birthMonth;
	private String birthDay;
	private String enterpriseName;
	private String reservedNum;
	private String elevenDiscount;
	private String vipDiscount;
	private String birthdayDiscount;
	private String enterpriseDiscount;
	private String threeReservDiscount;
	
	public void setDouble11(String str, String end, String dis){
		this.startDate=str;
		this.endDate=end;
		this.elevenDiscount=dis;
	}
	
	public String getDouble11(){
		return this.startDate + this.endDate + this.elevenDiscount;
	}
	
	public String getVIP(){
		return this.commercialArea + this.vipDiscount;
	}
	
	public String getBirthday(){
		return this.birthMonth + this.birthDay + this.birthdayDiscount;
	}
	
	public String getEnterprise(){
		return this.enterpriseName+ this.enterpriseDiscount;
	}
	
	public String getThreeReserve(){
		return this.reservedNum+ this.threeReservDiscount;
	}
}
