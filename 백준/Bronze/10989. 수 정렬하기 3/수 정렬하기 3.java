import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] countArray = new int[10001];

        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            countArray[T]++;
        }

        for (int i = 0; i <= 10000; i++) {
            while (countArray[i]-- > 0){
                bw.write(i + "\n");
            }
        }

        bw.flush();
    }
}
