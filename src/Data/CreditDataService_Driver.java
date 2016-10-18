package Data;

import DataService.CreditDataService;
import po.UserInfoPO;

public class CreditDataService_Driver {
	public static void main(String[] args){
		CreditDataService_Stub creditDataService = new CreditDataService_Stub();
		CreditDataService_Driver driver = new CreditDataService_Driver();
	        driver.drive(creditDataService);
	}
	    public void drive(CreditDataService creditDataService){
	       UserInfoPO po = new UserInfoPO("George","12345","9");
	    	
	        if(creditDataService.find("George"))
	        	System.out.println("find succeed");
	        if(creditDataService.add("George",9))
	        	System.out.println("add succeed");
	        if(creditDataService.update(po))
	        	System.out.println("update succeed");
	       
	    }
}
