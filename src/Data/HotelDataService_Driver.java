package Data;

import po.HotelPO;

public class HotelDataService_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelDataService_Stub a=new HotelDataService_Stub();
		HotelDataService_Driver b=new HotelDataService_Driver();
		b.drive(a);
	}

	private void drive(HotelDataService_Stub a) {
		// TODO Auto-generated method stub
		HotelPO updatepo=new HotelPO();
		a.update(updatepo);
	}
	
}
