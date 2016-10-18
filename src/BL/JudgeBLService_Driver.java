package BL;



import BLService.JudgeBLService;
import util.ResultMessage;
import vo.UserInfoVO;

public class JudgeBLService_Driver {
	public void drive(JudgeBLService service){
		//UserInfoVO user = new UserInfoVO("George","12345","1000");
		ResultMessage result1 = service.setStar(4);
		ResultMessage result2 = service.setEvaluation("I don't like this hotel");
		if(result1.isPass()){
			System.out.println("Star set up sucessfully");
		}else{
			System.out.println("Star set up falied");
		}
		
		if(result2.isPass()){
			System.out.println("Evaluation set up sucessfully");
		}else{
			System.out.println("Evaluation set up falied");
		}
		
		
	}
	
	public static void main(String[] args){
		JudgeBLService_Driver driver = new JudgeBLService_Driver();
		JudgeBLService_Stub stub = new JudgeBLService_Stub();
		driver.drive(stub);
	}
}
