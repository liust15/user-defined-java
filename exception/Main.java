package exception;

/**
 * @program: lianbiao
 * @description:
 * @author: liust
 * @create: 2018-04-16 19:18
 **/
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new UserService().login("admin","12345").toString());
        } catch (MyException e) {
            System.out.println(e);
        }
        try {
            System.out.println(new UserService().login("admin1","12345"));
        } catch (MyException e) {
            System.out.println(e);
        }
        try {
            System.out.println(new UserService().login("admin","123456"));
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}
