import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dan = Integer.parseInt(br.readLine());

        for (int i = 0; i < 9; i++) {
            System.out.println(dan + " * " + (i+1) + " = " + dan * (i+1));
        }
    }
}