import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toLowerCase().replaceAll(" ", "").toCharArray();

        int[] counts = new int['z' - 'a' + 1];

        for (int i = 0; i < input.length; i++){
            counts[input[i]-'a']++;
        }
        int max = 0;
        char result = 63; // ?

        for (int j = 0; j < counts.length; j++){
            if(counts[j] > max) {
                max = counts[j];
                result = (char) (j + 'A');
            } else if (counts[j] == max) {
                result = 63;
            }
        }
        System.out.println(result);
    }
}
