package shiyan1;

public class LoginForm {
    private LoginBO login;
    //无参构造
    public LoginForm(){
        login = new LoginBO();
    }
    public void vaildate(String account,String password){
        login.vaildate(account,password);
    }

}
