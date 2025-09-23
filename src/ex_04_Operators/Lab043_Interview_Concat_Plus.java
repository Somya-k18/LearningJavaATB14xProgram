package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        //Very Important Interview question
        String f_name = "Somya";
        String l_name = "Khandelwal";

        int a = 10;
        int b = 10;
        System.out.println(f_name + l_name + a + b); //sk1010
        System.out.println(a + b + f_name + l_name); //20sk

        //BODMAS
        System.out.println(f_name + l_name + (a + b)); //sk20
    }
}
