package Exceptionhandling;

import java.util.concurrent.ExecutionException;

public class multipletrycatch {
    public static void main(String[] args) {
       // try {}  only try not allowed  get CTE
        //catch{} only catch not allowed  get CTE
        //try{}try{} multiple try not allowed  get CTE
        //finally{}finally{}//multi finally not allowed  get CTE

       // valid  :  tc, tcf ,tccf, tf.
        //invalid :t,c,tt,cc,f,ttc,tcff,ttf,ttcf.
        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("divide by zero");

        }catch (Exception exception){
            System.out.println("exception");
            System.out.println(10/0);
        }finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
        System.out.println("rest of the code");
}
}
