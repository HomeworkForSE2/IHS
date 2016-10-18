package BLService;

import vo.HotelInfoVO1;

import java.util.ArrayList;

public interface HotelBrowseBLService {
    public ArrayList viewHotelList(String area);
    public void setViewOrder(boolean star, boolean price);

}
