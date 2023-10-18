import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input1, input2));
    }

    private static int solution(String input1, String input2) {
        String replaceString = input1.replace(input2, "");
        return (input1.length() - replaceString.length()) / input2.length();
    }
}