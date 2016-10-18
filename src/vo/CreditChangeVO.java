package vo;

public class CreditChangeVO {
	
	private String time;
	private String orderNum;
	private String action;
	private int creditChange;
	private int credit;
	
	
	public CreditChangeVO(String time,String orderNum,String action,int creditChange,int credit){
		this.time=time;
		this.orderNum=orderNum;
		this.action=action;
		this.creditChange=creditChange;
		this.credit=credit;
	}
	
	
	public String getTime(){
		return time;
	}

	public String getOrderNum(){
		return orderNum;
	}
	
	public String getAction(){
		return action;
	}
	
	public int getCreditChange(){
		return creditChange;
	}
	
	public int getCredit(){
		return credit;
	}
}
