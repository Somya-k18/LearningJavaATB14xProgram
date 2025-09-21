package ex_02_JavaBasics;

public class Lab023_printF {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.print(b);
        System.out.println();
        System.out.printf("Value of a is %d",a);
        System.out.println();
        System.out.printf("Value of b = %d",b);

        /* %d -> int. byte, short, long
           %s -> string
           %f -> float, double
           %b -> boolean
        * */

    }
}
