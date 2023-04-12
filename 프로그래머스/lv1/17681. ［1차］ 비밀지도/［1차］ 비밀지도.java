class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        new StringBuilder();
        StringBuilder sb;

        for (int i = 0; i < n; i++){
            String temp1 = binaryToSharp(n, Integer.toBinaryString(arr1[i]));
            String temp2 = binaryToSharp(n, Integer.toBinaryString(arr2[i]));
            sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (temp1.charAt(j) == '#' || temp2.charAt(j) == '#') {
                    sb.append('#');
                } else {
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
    
    public static String binaryToSharp(int n, String s){

        StringBuilder str = new StringBuilder(s);
        StringBuilder result = new StringBuilder();

        int cnt = str.length();
        for (int k = 0; k < n - cnt; ) {
            if (cnt < n) {
                str.insert(0, "0");
                cnt++;
            }
        }

        for (int l = 0; l < str.length(); l++){
            if (str.charAt(l) == '1'){
                result.append('#');
            } else {
                result.append(' ');
            }
        }

        return result.toString();

    }
}