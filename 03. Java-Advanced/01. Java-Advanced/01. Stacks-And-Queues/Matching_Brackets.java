import java.util.ArrayDeque;
import java.util.Scanner;

public class Matching_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                stack.push(i);
            } else if (expression.charAt(i) == ')') {
                System.out.println(expression.substring(stack.pop(), i + 1));
            }
        }
    }
}
