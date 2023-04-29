package Exceptionhandling;

public class demo1000{
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println(10 / 1);
            System.exit(0);
        }
        finally {
            System.out.println("finally block");
            //System.exit(0);
        }
        System.out.println("rest of the code");
    }
}