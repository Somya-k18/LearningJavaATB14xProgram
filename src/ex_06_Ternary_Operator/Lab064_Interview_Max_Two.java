package ex_06_Ternary_Operator;

public class Lab064_Interview_Max_Two {
    public static void main(String[] args) {
        //Find Maximum number between two numbers.

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));
        // package --> java.lang.Math - already imported

        int max = x > y ? x : y;
        System.out.println(max);
    }

}
