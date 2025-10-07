package ex_05_TypeCasting;

public class Lab059_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 789456123l;
        //short s = phone_no; // Narrowing - Implicit --> Invalid
        short s = (short)phone_no; // Narrowing - Explicit --> Valid
        System.out.println(s);
    }
}
