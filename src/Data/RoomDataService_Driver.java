package Data;

import po.RoomPO;

public class RoomDataService_Driver {
	public static void main(){
	RoomDataService_Stub a=new RoomDataService_Stub();
	RoomDataService_Driver b=new RoomDataService_Driver();
	b.drive(a);
	}

	private void drive(RoomDataService_Stub a) {
		// TODO Auto-generated method stub
		RoomPO po=new RoomPO();
		a.insert(po);
		a.update(po);
	}
}
