import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next().toCharArray();
        }

        int cntA = 0;
        int cntB = 0;

        for (int r = 0; r < N; r++) {
            boolean exist = false;
            for (int j = 0; j < M; j++) {
                if(arr[r][j] == 'X'){
                    exist = true;
                    break;
                }
            }
            if(exist)
                cntA++;
        }

        for (int c = 0; c < M; c++) {
            boolean exist = false;
            for (int j = 0; j < N; j++) {
                if(arr[j][c] == 'X'){
                    exist = true;
                    break;
                }
            }
            if(exist)
                cntB++;
        }

        int needRowCount = N - cntA;
        int needColCount = M - cntB;

        System.out.println(Math.max(needRowCount, needColCount));
    }
}
