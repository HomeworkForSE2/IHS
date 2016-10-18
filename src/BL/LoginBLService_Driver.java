package BL;

import BLService.LoginBLService;
import vo.LoginVO;

public class LoginBLService_Driver {
    public static void main(String args[]){
        LoginBLService_Stub lg = new LoginBLService_Stub();
        LoginBLService_Driver driver = new LoginBLService_Driver();
        driver.drive(lg);
    }

    public void drive(LoginBLService lg){
        lg.endLogin("刘钦","12345678");
    }
}
