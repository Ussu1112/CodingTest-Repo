import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = recursion(num);

        System.out.println(answer);
    }

    private static int recursion(int num) {

        if (num == 0){
            return 1;
        } else {
            return num * recursion(num -1);
        }
    }
}