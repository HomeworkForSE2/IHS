package BL;


import vo.hotelInfoVO;
import java.util.ArrayList;

import BLService.HotelBrowseBLService;

public class HotelBrowseBLService_Stub implements HotelBrowseBLService{
    hotelInfoVO hotel1 = new hotelInfoVO("格林豪泰", "南京仙林","仙林大学城",1,"*","*",5000);
    hotelInfoVO hotel2 = new hotelInfoVO("格林豪泰", "南京仙林","仙林大学城",2,"*","*",4000);
    hotelInfoVO hotel3 = new hotelInfoVO("格林豪泰", "南京仙林","仙林大学城",3,"*","*",3000);
    hotelInfoVO hotel4 = new hotelInfoVO("格林豪泰", "南京仙林","仙林大学城",4,"*","*",2000);
    hotelInfoVO hotel5 = new hotelInfoVO("格林豪泰", "南京仙林","仙林大学城",5,"*","*",1000);


    public ArrayList viewHotelList(String s){
        
        ArrayList ar = new ArrayList();
        hotelInfoVO hotel = new hotelInfoVO("格林豪泰", "南京仙林","仙林大学城",3,"*","*",5000);
        String address = hotel.getHotelAddress();
        String name = hotel.getHotelName();
        String BD = hotel.getHotelBD();
        if(address==s
                ||name==s
                ||BD==s){
            ar.add(address);
            return ar;
        }else {
            System.out.println("没有符合条件的酒店");
            return ar;
        }
    }
    public void setViewOrder(boolean star, boolean price){

        if(price==true){
            System.out.println(hotel5.getHotelName()+" "+hotel5.getHotelBD()+" "+hotel5.getHotelAddress()+" "
                    +hotel5.getHotelStars()+" "+hotel5.getHotelIntro()+" "+hotel5.getHotelIntro()+" "+hotel5.getHotelPrice());
            System.out.println(hotel4.getHotelName()+" "+hotel4.getHotelBD()+" "+hotel4.getHotelAddress()+" "
                    +hotel4.getHotelStars()+" "+hotel4.getHotelIntro()+" "+hotel4.getHotelIntro()+" "+hotel4.getHotelPrice());
            System.out.println(hotel3.getHotelName()+" "+hotel3.getHotelBD()+" "+hotel3.getHotelAddress()+" "
                    +hotel3.getHotelStars()+" "+hotel3.getHotelIntro()+" "+hotel3.getHotelIntro()+" "+hotel3.getHotelPrice());
            System.out.println(hotel2.getHotelName()+" "+hotel2.getHotelBD()+" "+hotel2.getHotelAddress()+" "
                    +hotel2.getHotelStars()+" "+hotel2.getHotelIntro()+" "+hotel2.getHotelIntro()+" "+hotel2.getHotelPrice());
            System.out.println(hotel1.getHotelName()+" "+hotel1.getHotelBD()+" "+hotel1.getHotelAddress()+" "
                    +hotel1.getHotelStars()+" "+hotel1.getHotelIntro()+" "+hotel1.getHotelIntro()+" "+hotel1.getHotelPrice());
        }
        if(star==true){
            System.out.println(hotel1.getHotelName()+" "+hotel1.getHotelBD()+" "+hotel1.getHotelAddress()+" "
                    +hotel1.getHotelStars()+" "+hotel1.getHotelIntro()+" "+hotel1.getHotelIntro()+" "+hotel1.getHotelPrice());
            System.out.println(hotel2.getHotelName()+" "+hotel2.getHotelBD()+" "+hotel2.getHotelAddress()+" "
                    +hotel2.getHotelStars()+" "+hotel2.getHotelIntro()+" "+hotel2.getHotelIntro()+" "+hotel2.getHotelPrice());
            System.out.println(hotel3.getHotelName()+" "+hotel3.getHotelBD()+" "+hotel3.getHotelAddress()+" "
                    +hotel3.getHotelStars()+" "+hotel3.getHotelIntro()+" "+hotel3.getHotelIntro()+" "+hotel3.getHotelPrice());
            System.out.println(hotel4.getHotelName()+" "+hotel2.getHotelBD()+" "+hotel2.getHotelAddress()+" "
                    +hotel2.getHotelStars()+" "+hotel2.getHotelIntro()+" "+hotel2.getHotelIntro()+" "+hotel2.getHotelPrice());
            System.out.println(hotel5.getHotelName()+" "+hotel5.getHotelBD()+" "+hotel5.getHotelAddress()+" "
                    +hotel5.getHotelStars()+" "+hotel5.getHotelIntro()+" "+hotel5.getHotelIntro()+" "+hotel5.getHotelPrice());
        }
        
    }

}
