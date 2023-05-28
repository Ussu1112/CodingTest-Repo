import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean foo = true;

        while (foo){
            String[] strs = br.readLine().split(" ");
            if (Integer.parseInt(strs[0]) == 0 && Integer.parseInt(strs[1]) == 0){
                foo = false;
            } else
                System.out.println(Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]));
        }
    }
}