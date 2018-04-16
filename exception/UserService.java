package exception;

/**
 * @program: lianbiao
 * @description: 测试
 * @author: liust
 * @create: 2018-04-16 19:13
 **/
public class UserService {
    public User login(String username, String password) throws MyException {
        if (!"admin".equals(username)) {
            throw new MyException("账号不正确");
        } else if (!"12345".equals(password)) {
            throw new MyException("密码不正确！");
        }
        return new User("admin", "12345");
    }
}
