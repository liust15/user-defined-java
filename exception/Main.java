package exception;

/**
 * @program: lianbiao
 * @description:
 * @author: liust
 * @create: 2018-04-16 19:18
 * Exception与RuntimeException
 * Exception：受检异常，在编程期检查，在调用抛出的这个异常的方法时，必须显示的使用try...catch...
 * RuntimeException：非受检异常，在运行期间检查，在调用抛出的这个异常的方法时，可以不用显示使用try...catch...
 * 在使用自定义异常时，根据实际的业务要求，来决定使用哪个做为继承的父类
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
