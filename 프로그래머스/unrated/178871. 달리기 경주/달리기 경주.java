import java.util.*;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            String player = players[i];
            map.put(player, i);
        }

        for (int i = 0; i < callings.length; i++) {
            int playerPosition = map.get(callings[i]);
            String forwardCalling = players[playerPosition - 1];

            players[playerPosition - 1] = callings[i];
            map.put(callings[i], playerPosition - 1);

            players[playerPosition] = forwardCalling;
            map.put(forwardCalling, playerPosition);
        }

        return players;
    }
}