package exception;


/**
 * @program: lianbiao
 * @description: 自定义异常类通常都是继承一个异常类来实现
 * @author: liust
 * @create: 2018-04-16 19:10
 * 自定义异常的实现是，提供构造方法
 * 异常对象本身没有实际功能，只有一个有意义的标识
 **/
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
