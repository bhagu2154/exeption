package Exceptionhandling;

public class demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);//after the exception not print the rest of the try
            System.out.println("rest of the try");
        }catch (ArithmeticException arithmeticException){
            System.out.println("AR  Arithmetic Exception");
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
        System.out.println("rest of the code");
        System.out.println("rest of the code");
        System.out.println("rest of the code");
        System.out.println("rest of the code");
    }
}//in this case o/p is the 10,rest of the try &rest of the code bz control will not come inside  catch block
//if the 10/0 then o/p will be "Ar Arithmetic exception" &rest of the will not be executed.
