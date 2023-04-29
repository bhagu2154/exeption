package Exceptionhandling;

public class stringNeagativeOutOfBoundException {
    public static void main(String[] args) {
        String str = "pqrs";
        System.out.println(str.charAt(-1));
    }
}
