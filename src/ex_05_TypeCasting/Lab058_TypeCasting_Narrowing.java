package ex_05_TypeCasting;

public class Lab058_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;

        //byte b = val; // InValid - Narrowing -> Implicit Casting

        byte b = (byte)val; // Valid - Narrowing -> Explicit Casting
        /*
        300 converted into binary number then only 8 bit digits
        will be taken and then converted into decimal number,
        so O/P will be 44. ---> data loss occurred
        */
        System.out.println(b);
    }
}
