package Exceptionhandling;

import java.util.Scanner;

public class deminputmismatcherror {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two number");
        int  number1= scanner.nextInt();
        int number2= scanner.nextInt();
       System.out.println(number1+number2);//2 & 2.5 we get InputMismatchException
       // System.out.println(number1/number2);
        System.out.println("rest of the code...............");
    }
}
