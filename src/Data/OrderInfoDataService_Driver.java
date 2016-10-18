package Data;

import po.OrderPO;

public class OrderInfoDataService_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OrderInfoDataService_Stub a=new  OrderInfoDataService_Stub();
		 OrderInfoDataService_Driver b=new OrderInfoDataService_Driver();
		 b.drive(a);
	}

	private void drive(OrderInfoDataService_Stub a) {
		// TODO Auto-generated method stub
		OrderPO deletepo=new OrderPO();
		a.delete(deletepo);
		a.insert(deletepo);
		a.modifyErrorToDo(deletepo);
		a.modifyUndoToError(deletepo);
	}

}
