import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input1, input2));
    }

    private static int solution(String input1, String input2) {
        int answer = 0;
        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i = 0; i < input1.length(); i++) {
            countA[input1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < input2.length(); i++) {
            countB[input2.charAt(i)- 'a']++;
        }

        for (int i = 0; i < countA.length; i++) {
            answer += Math.abs(countA[i]-countB[i]);
        }

        return answer;
    }
}
