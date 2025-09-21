package ex_02_JavaBasics;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a = 10;
        a = 11;
        System.out.println(a);

        final int b = 99;
        //b = 100; --> Error = java: cannot assign a value to final variable b

        final float Pi = 3.14f;
        System.out.println(Pi);

    }
}
