import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] strs = br.readLine().split(" ");
            System.out.println(Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]));
        }
    }
}