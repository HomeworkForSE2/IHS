package BL;

import vo.RoomVO;

public class RoomBLService_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomBLService_Stub a=new RoomBLService_Stub();
		RoomBLService_driver b=new RoomBLService_driver();
		b.drive(a);
	}

	private void drive(RoomBLService_Stub a) {
		// TODO Auto-generated method stub
		RoomVO recordEmptyvo=new RoomVO(2,1,100);
		RoomVO recordLeftvo=new RoomVO(2,1,"2016/8/15");
		RoomVO recordOccupiedvo=new RoomVO(2,"2016/8/15","2016/8/20");
		a.recordEmpty(recordEmptyvo);
		a.recordLeft(recordLeftvo);
		a.recordOccupied(recordOccupiedvo);
		a.endRoom();
		
	}
	
}
