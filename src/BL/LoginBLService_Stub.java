package BL;

import BLService.LoginBLService;
import vo.LoginVO;


public class LoginBLService_Stub implements LoginBLService{

    public boolean endLogin(String name, String key){
        LoginVO login = new LoginVO("刘钦","12345678");
        String userName = login.getUserName();
        String passmord = login.getPassword();

        if(userName==name
                &&passmord==key){
            System.out.println("correct!");
            return true;
        }else {
            System.out.println("wrong!");
            return false;
        }
    }
}
