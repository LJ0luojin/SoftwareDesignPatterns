package shiyan1;

public class LoginForm {
    private LoginBO login;
    //无参构造
    public LoginForm(){
        login = new LoginBO();
    }
    public void validate(String account,String password){
        MainForm mainForm = new MainForm();
        boolean validate = login.validate(account, password);
    }

}
