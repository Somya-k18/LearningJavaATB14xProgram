package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // valid syntax - Implicit Casting -> (Widening) EXIST
        byte b1 = 10;
        int a1 = (int) b1; // valid syntax - Explicit Casting ( in case of widening ) Not Needed

        /* invalid syntax
        int a1 = 300;
        byte b1 = a1 ;
         */
    }
}
