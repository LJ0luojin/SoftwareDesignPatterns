package shiyan1;

public interface IUserDAO {
    boolean findUserByAccAndPwd(String account, String password);
}
