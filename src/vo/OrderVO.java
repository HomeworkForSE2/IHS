package vo;

public class OrderVO {
	int  roomType; 
	int roomTotal;
	String roomPlanInTime;
	String roomPlanOutTime;
	int childrenHave;
	int peopleTotal;
	String orderCreate;
	private int orderNum;
    
	
    public OrderVO(String hotelName,int roomType,int roomPrice,int roomTotal,String hotelJudge,String orderState){
    	  
      }
    public OrderVO(String userName,int roomNum,String roomPlanInTime,String orderState){
    	  
     }
	public OrderVO(String ordercreate , String roomPlanInTime, String roomPlanOutTime, int roomType, int roomTotal, int peopleTotal , int childrenHave) {
		// TODO Auto-generated constructor stub
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
}
