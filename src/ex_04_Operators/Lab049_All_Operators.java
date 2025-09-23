package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;
        //Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Compound Assignment Operators
        int age = 10, age1 = 10, age2 = 10, age3 = 10 ;
        age += 10; // age = age + 10;
        age1 -= 10;
        age2 /= 10;
        age3 *= 10;
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);

        //Optional to learn - Digital electronics
        /* Bitwise - Not Important for Automation
            ~ -> Bitwise Not, >> -> Right Shift, << -> Left shift, ^ -> XOR
        */
    }
}
