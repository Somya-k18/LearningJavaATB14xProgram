package ex_02_JavaBasics;

public class Lab014_Variables {
    public static void main(String[] args) {
        /*
        * data_type variable_name = variable_value (Literal)
        * */
        byte age = 65;
        //short age1 = 45;  variable_name should be unique

        /*
        * byte 123 = 65; is not valid
        * byte _ = 65; is valid
        * */
        age = 122;
        age = 111;
        System.out.println(age);
    }
}
