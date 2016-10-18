package vo;

public class HotelInfoVO1 {
	  private String hotelName;
	  private String hotelAddress;
	  private String hotelBD;
	  private int hotelStars;
	  private String hotelIntro;
	  private String hotelFaci;
    
      
      public HotelInfoVO1 (String n,String ha,String hBD,int hs,String hi,String hf){
    	   hotelName=n;
   	       hotelAddress=ha;
           hotelBD=hBD;
           hotelStars=hs;
           hotelIntro=hi;
           hotelFaci=hf;         
      }
      
      public String getHotelName(){
    	  return hotelName;
      }
      
      public boolean hasW(){
    	  return true;
      }
      

	
	
	
}
