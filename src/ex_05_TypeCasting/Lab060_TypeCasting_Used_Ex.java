package ex_05_TypeCasting;

public class Lab060_TypeCasting_Used_Ex {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total1 = course + GST; // Narrowing - Implicitly
        int total = course + (int)GST; // Narrowing - Explicitly
        System.out.println(total);

        float total2 = course + GST; // Widening - Implicitly
        System.out.println(total2);
    }
}
