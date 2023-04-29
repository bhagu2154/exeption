package Exceptionhandling;

public class de2 {
    public static void main(String[] args) {
       // main(null);// in this case we get stackoverflow 
        m1();
    }
    private static void m1() {
        int varible=10;
            System.out.println("m1");
            m2();
        }

    private static void m2() {
        int varible=30;
        System.out.println("m2");
        m3();
    }

    private static void m3() {
        int varible=40;
        System.out.println("m3");
        m4();
    }

    private static void m4() {
        int varible=50;
        System.out.println("m4");
    }
}