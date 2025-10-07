package ex_06_Ternary_Operator;

public class Lab063_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21;
        // Multiple Ternary Operator or Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3): expression4;
        String result = (age > 18) ? (age > 25 ? "You can drink": "You can go to Goa but can't drink"): "No";
        System.out.println(result);
    }
}
