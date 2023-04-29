package Exceptionhandling;

public class NullPointerExceptionH {
    public static void main(String[] args) {
try {
    System.out.println(10/0);
    String str = null;
    System.out.println(str.length());//nullPointerException
}catch (ArithmeticException arithmeticException){
    System.out.println("developer arithmatic exception");
}
catch (NullPointerException nullPointerException){
    System.out.println("nullpointerexceptoin handler");
        System.out.println("rest of the code..... ");
    }
}}