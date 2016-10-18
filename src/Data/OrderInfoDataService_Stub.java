package Data;

import DataService.OrderinfoDataService;
import po.OrderPO;

public class OrderInfoDataService_Stub implements OrderinfoDataService{
	public  OrderInfoDataService_Stub(){
		
	}
	public void delete(OrderPO po){
		System.out.println("delete succeed");
	}
    public void insert(OrderPO po){
    	System.out.println("insert succeed");
    }
    public void modifyUndoToError(OrderPO po){
    	System.out.println("modify succeed");
    }
    public void modifyErrorToDo(OrderPO po){
    	System.out.println("modify succeed");
    }
}
