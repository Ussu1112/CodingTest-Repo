import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int X = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] < X)
                sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}