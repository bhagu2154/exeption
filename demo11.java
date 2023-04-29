package Exceptionhandling;

public class demo11 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ex){
            System.out.println("catch");
            System.out.println(10/0);
        }finally {
            System.out.println("rest of the");
        }
        System.out.println("rest of the code");
    }
}
