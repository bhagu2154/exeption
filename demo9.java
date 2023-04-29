package Exceptionhandling;

public class demo9 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("catch");
            System.exit(0);
            System.out.println(10/0);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}
