package ex_02_JavaBasics;

public class Task_Table_of_9_with_PrintF {
    public static void main(String[] args) {
        int tab = 9;
        System.out.println("Table of 9");
        //9 x 1 = 9
        System.out.printf("%d x 1 = %d \n",tab, tab*1);
        System.out.printf("%d x 2 = %d \n", tab, tab*2);
        System.out.printf("%d x 3 = %d \n", tab, tab*3);
        System.out.printf("%d x 4 = %d \n", tab, tab*4);
        System.out.printf("%d x 5 = %d \n", tab, tab*5);
        System.out.printf("%d x 6 = %d \n", tab, tab*6);
        System.out.printf("%d x 7 = %d \n", tab, tab*7);
        System.out.printf("%d x 8 = %d \n", tab, tab*8);
        System.out.printf("%d x 9 = %d \n", tab, tab*9);
        // by using println() function
        System.out.printf("%d x 10 = %d", tab, tab*10).println();
        System.out.printf("%d x 11 = %d", tab, tab*11);

    }
}
