package Exceptionhandling;

public class numberformatException {
    public static void main(String[] args) {
        Integer integer=Integer.valueOf("123");
        System.out.println(integer);
        Integer integer1=Integer.valueOf("abc");//numberFormatException
        System.out.println(integer1);

    }
}
