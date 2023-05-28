import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        long N = Long.parseLong(strs[0]);
        long M = Long.parseLong(strs[1]);
        long answer = Math.abs(N - M);
        System.out.println(answer);
    }
}