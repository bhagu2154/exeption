package Exceptionhandling;

public class tryfinally {
    public static void main(String[] args) {
        try {
           // System.out.println(10/0);
            System.out.println(10/1);
        }finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}

//o/p: finally & Arithmetic exception
//2)}//o/p: 10,finally,rest of the code