package vo;

public class hotelInfoVO {
	private static String hotelName;
	private static String hotelAddress;
	private static String hotelBD;
	private static int hotelStars;
	private static int hotelPrice;
	private static String hotelIntro;
	private static String hotelFaci;
    
      
	public hotelInfoVO (String n,String ha,String hBD,int hs,String hi,String hf,int pr){
    	   hotelName=n;
   	       hotelAddress=ha;
           hotelBD=hBD;
           hotelStars=hs;
           hotelIntro=hi;
           hotelFaci=hf;
		   hotelPrice = pr;
	}
      
	public String getHotelName(){
    	  return hotelName;
	}

	public int getHotelStars() {
		return hotelStars;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public String getHotelBD() {
		return hotelBD;
	}

	public String getHotelFaci() {
		return hotelFaci;
	}

	public String getHotelIntro() {
		return hotelIntro;
	}

	public static int getHotelPrice() {
		return hotelPrice;
	}
}
