package shiyan1;

public class LoginBO {
    private IUserDAO userDAO;

    public void setUserDAO(IUserDAO userDAO){
        this.userDAO = userDAO;
    }
    public boolean validate(String account, String password) {
        return userDAO.findUserByAccAndPwd(account, password);
    }
}
