package vo;


public class LoginVO {

    private static String userName;

    private static String password;

    public static String getPassword() {
        return password;
    }

    public static String getUserName() {
        return userName;
    }

    public LoginVO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
