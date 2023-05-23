import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> prQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            prQueue.add(scoville[i]);
        }

        while (prQueue.peek() < K){
            if (prQueue.size() == 1)
                return -1;
            prQueue.add(prQueue.poll() + prQueue.poll() * 2);
            answer++;
        }

        return answer;
    }
}