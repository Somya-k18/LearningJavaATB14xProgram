public class Live_Test_challenge3 {
    public static void main(String[] args) {
       /* Comparison and Logical Operators
        Write a program that demonstrates comparison and logical operators.

                **Requirements:**
        - Use comparison operators (==, !=, <, >, <=, >=)
        - Use logical operators (&&, ||, !)
        - Print boolean results with explanatory messages*/

        //Input:10 5
        //Output:
        /* a == b: false a > b: true a < b: false
         (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false*/

        int a = 10;
        int b = 5;
        boolean res = a < b;
        boolean res1 = (a > b) && (a > 0);
        boolean res2 = (a < b) || (a > 0);
        boolean res3 = !(a > b);
        System.out.print("a == b: ");
        System.out.println(a==b);
        System.out.print("a > b: ");
        System.out.println(a>b);
        System.out.println("a < b: "+ res);
        System.out.println("(a > b) && (a > 0): "+ res1);
        System.out.println("(a < b) || (a > 0): "+ res2);
        System.out.println("!(a > b): "+res3);
    }
}
