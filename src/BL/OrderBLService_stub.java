package BL;

import BLService.OrderBLService;
import vo.OrderVO;

public  class OrderBLService_stub implements OrderBLService {
	
	String hotelName;
	int roomType; 
	int roomPrice;
	int roomTotal;
	String hotelJudge;
	String orderState;
	int orderNum;
	String userName;
	String roomPlanInTime;
	String roomInTime;
	 public void createOrder(OrderVO vo){
		 System.out.println("createOrder  succeed !");
	 }
     public void deleteOrder(int orderNum){
    	 System.out.println("deleteOrder  succeed !");
     }
     public OrderVO showUserOrder(int orderNum){
    	 return new OrderVO(hotelName,roomType, roomPrice, roomTotal,hotelJudge,
    	  orderState);
     }
     public OrderVO showUndoOrder(String orderState){
    	 return new OrderVO( userName, roomTotal,roomPlanInTime,orderState);
     }
     public OrderVO showDoOrder(String orderState){
    	 return  new OrderVO( userName,roomTotal, roomInTime,orderState);
       	  
     }
     public OrderVO showErrorOrder(String orderState){
    	 return  new OrderVO( userName,roomTotal, roomInTime,orderState);
     }
     public OrderVO showdeleteOrder(String  orderState){
    	 return  new OrderVO( userName,roomTotal, roomInTime,orderState);
     }
     public void modifyUndoToError(int orderNum){
    	 System.out.println("modifyOrder  succeed !");
     }
     public void modifyErrorToDo(int orderNum){
    	 System.out.println("modifyOrder  succeed !");
     }
     public void endOrder(){
    	 System.out.println("end order!");
     }
}
