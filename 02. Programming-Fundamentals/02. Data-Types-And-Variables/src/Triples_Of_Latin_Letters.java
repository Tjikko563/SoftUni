import java.util.Scanner;

public class Triples_Of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c\n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}