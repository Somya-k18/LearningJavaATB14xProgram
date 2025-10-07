package ex_06_Ternary_Operator;

public class Task_TO_Max_three_InterviewQ {
    public static void main(String[] args) {
        //Maximum number out of 3
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        String max = n1 > n2 ? (n1 > n3 ? "N1 is max":"N3 is max"): n2 > n3 ? "N2 is max":"N3 is max";

        System.out.println(max);

    }
}
