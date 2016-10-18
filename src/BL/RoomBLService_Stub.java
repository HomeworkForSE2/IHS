package BL;

import BLService.RoomBLService;
import vo.RoomVO;

public class RoomBLService_Stub implements RoomBLService {
		int roomType;
		int roomTotal;
		int roomPrice;
		int roomNumber;
		int roomPlanInTime;
		int roomPlanOutTime;
		int roomInTime;
		int roomOutTime;
		
		public RoomBLService_Stub(int roomType,int roomTotal,int roomPrice){
			this.roomType=roomType;
			this.roomTotal=roomTotal;
			this.roomPrice=roomPrice;
		}
	    public RoomBLService_Stub() {
			// TODO Auto-generated constructor stub
		}
		public void recordEmpty(RoomVO vo){
	    	System.out.println("recordEmpty  succeed !");
	    }
	    public void recordLeft(RoomVO vo){
	    	System.out.println("recordLeft  succeed !");
	    }
	    public void recordOccupied(RoomVO vo){
	    	System.out.println("recordOccupied  succeed !");
	    }
	    public void endRoom(){
	    	System.out.println("end the record !");
	    }
}
