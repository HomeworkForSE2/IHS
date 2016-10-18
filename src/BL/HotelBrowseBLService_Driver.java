package BL;

import java.io.Serializable;

import BLService.HotelBrowseBLService;
import vo.HotelInfoVO1;

public class HotelBrowseBLService_Driver {
    public static void main(String args[]){
        HotelBrowseBLService_Stub hotel = new HotelBrowseBLService_Stub();
        HotelBrowseBLService_Driver driver = new HotelBrowseBLService_Driver();
        driver.drive(hotel);
    }

    public void drive(HotelBrowseBLService hotel){
        hotel.setViewOrder(true, false);
        hotel.viewHotelList("南京仙林");
    }
}
