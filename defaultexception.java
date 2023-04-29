package Exceptionhandling;

import static java.lang.System.*;

public class defaultexception {
    public static void main(String[] args) {
        out.println(10/0);//arithmetic exception//defaultException
        //throw  new ArithmeticException("divide by zero");
        out.println("rest of the main");
    }
}
