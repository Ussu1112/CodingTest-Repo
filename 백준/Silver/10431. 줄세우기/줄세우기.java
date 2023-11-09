import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N-- > 0){
            int T = sc.nextInt();
            int[] H = new int[20];

            for (int i = 0; i < 20; i++) {
                H[i] = sc.nextInt();
            }

            int cnt = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                // 1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
                // 1-1. 찾지 못했다면, 줄의 가능 뒤에 선다.
                for (int j = 0; j < i; j++) {
                    if(H[j] > H[i]){
                        int myH = H[i];
                        // 2. 찾았다면, 그 학생의 앞에 선다.

                        // 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        for (int k = i; k > j; k--) {
                            H[k] = H[k - 1];
                            cnt++;
                        }
                        H[j] = myH;
                        break;
                    }
                }
            }
            System.out.println(T + " " + cnt);
        }
    }
}
