import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        System.out.println(solution(input1));
    }

    private static char solution(String input1) {
        int[] alphabets = getAlphabetCount(input1);
        int maxCount = -1;
        char maxAlphabet = '?';


        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > maxCount){
                maxCount = alphabets[i];
                maxAlphabet = (char)('A'+ i);
            } else if (alphabets[i] == maxCount){
                maxAlphabet = '?';
            }
        }
        
        return maxAlphabet;
    }

    private static int[] getAlphabetCount(String input1) {
        int[] count = new int[26];
        input1 = input1.toUpperCase();
        for (int i = 0; i < input1.length(); i++) {
            count[input1.charAt(i) - 'A']++;
        }
        return count;
    }
}
