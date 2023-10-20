import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        solution(input1, input2);
    }

    private static void solution(String input1, String input2) {
        String[] time = input1.split(":");
        int nowHH = Integer.parseInt(time[0]);
        int nowMM = Integer.parseInt(time[1]);
        int nowSS = Integer.parseInt(time[2]);
        int nowSecondAmount = nowHH * 3600 + nowMM * 60 + nowSS;

        int saltHH = Integer.parseInt(input2.substring(0,2));
        int saltMM = Integer.parseInt(input2.substring(3,5));
        int saltSS = Integer.parseInt(input2.substring(6,8));
        int saltSecondAmount = saltHH * 3600 + saltMM * 60 + saltSS;

        int answerSecondAmount = saltSecondAmount - nowSecondAmount;
        if (answerSecondAmount <= 0)
            answerSecondAmount += 24 * 3600;

        int answerHour = answerSecondAmount / 3600;
        int answerMinute = (answerSecondAmount % 3600) / 60;
        int answerSecond = answerSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", answerHour, answerMinute, answerSecond);
    }
}
