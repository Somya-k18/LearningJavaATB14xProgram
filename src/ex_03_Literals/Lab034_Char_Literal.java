package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
       // char c2 = "A"; // "" == String = Bunch of Char

        char c2 = '@';
        char c3 = '_';
        char c4 = '9';
        char c5 = 'b';
        char c6 = '(';
        char c7 = '{';
        char c8 = ' ';  // blank space

        //Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SomyaKhandelwal");
        System.out.println("Somya"+new_line+"Khandelwal");
        System.out.println("Somya\nKhandelwal");
        System.out.println("Somya"+tab_line+"Khandelwal");
        System.out.println("Somya"+back_space+"Khandelwal");
        System.out.println("Somya"+carriage_return+"Khandelwal");

        char c10 = 'A';  // ASCII, (limited numbers) - A -> 65 & unicode
        char rupees = '₹'; // ₹ = Ctrl + Alt + 4
        System.out.println(rupees);

        char laugh_smiley = '\u1f60';
        System.out.println(laugh_smiley); // Instead of this :), this is result -> ὠ



    }
}
