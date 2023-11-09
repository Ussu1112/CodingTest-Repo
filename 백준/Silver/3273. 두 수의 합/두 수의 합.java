import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < N; i++) {
            exist[arr[i]] = true;
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            // 현재 위치의 수와 더했을 때 X가 나오는 값
            int pairValue = X - arr[i];

            if (pairValue >= 0 && pairValue <= 1000000){
                // pairValue가 존재하면 카운팅
                answer += exist[pairValue] ? 1 : 0;
            }

        }
        System.out.println(answer / 2);
    }
}
