package BLService;

import vo.RoomVO;

public interface RoomBLService {
    public void recordEmpty(RoomVO vo);
    public void endRoom();
    public void recordLeft(RoomVO vo);
    public void recordOccupied(RoomVO vo);
    
}
