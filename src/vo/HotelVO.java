package vo;
import java.util.ArrayList;

public class HotelVO {
	private String status;
	private String star;
	private String evaluation;
	private ArrayList<HotelVO> hotel;
	
	public HotelVO(){
		
	}
	
	public HotelVO(String status, String star, String evaluation){
		this.status = status;
		this.star = star;
		this.evaluation = evaluation;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public String getStar(){
		return this.star;
	}
	
	public String getEvaluation(){
		return this.evaluation;
	}
	
	public ArrayList<HotelVO> getHotel() {
		return hotel;
	}
}
