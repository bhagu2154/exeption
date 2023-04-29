package Exceptionhandling;

public class finallynotexcecute {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            System.exit(0);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("divide by zero");
        }finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}
//O/p:  10 bz of control will not go inside the catch  finally is not excute bz of system.exite(),and then rest of code not excute bz of 10/1 codition is true