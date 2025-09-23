package ex_04_Operators;

public class Lab047_OR_AND_Gate {
    public static void main(String[] args) {
        // Or - ||
        System.out.println(true || true);  // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        /* AND - && -> only True && True returns True
           T && T = T
           T && F = F
           F && T = F
           F && F = F
        */
        System.out.println(true && true);  // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
    }
}
