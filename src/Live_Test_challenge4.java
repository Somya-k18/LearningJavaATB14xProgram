public class Live_Test_challenge4 {
    public static void main(String[] args) {
/*        Increment and Decrement Operators
        Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.

                **Requirements:**
        - Show the difference between ++i and i++
                - Show the difference between --i and i--
                - Print values before and after operations*/

        //Input:5
       /* Output:
        Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6)
        Pre-decrement: 5 Post-decrement: 5 (returned 5)*/
        int original = 5;
        int pre_inc = original;
        ++pre_inc;
        int post_inc = original;
        post_inc++;
        int pre_dec = pre_inc;
        --pre_dec;
        int post_dec = post_inc;
        post_dec--;

        System.out.println("Original: " + original);
        System.out.println("Pre-increment: " + pre_inc);
        System.out.println("Post-increment: " + post_inc + " (returned "+post_inc+")");
        System.out.println("Pre-decrement: " + pre_dec);
        System.out.println("Post-decrement: " + post_dec+ " (returned "+post_dec+")");

    }
}
