package ex_06_Ternary_Operator;

public class Task_TO_Age_Classification {
    public static void main(String[] args) {
        // Age Classification - Age = 59 --> Minor , Adult , Senior Citizen

        int age = 18;
        String classification = age >= 18 ? (age >= 60 ? "Senior Citizen":"Adult"):"Minor";
        System.out.println(classification);
    }
}
