import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            map.computeIfAbsent(seat[0], k -> new HashSet<>()).add(seat[1]);
        }
        int res = 0;
        for (int row : map.keySet()) {
            Set<Integer> seats = map.get(row);
            boolean left = !(seats.contains(2) || seats.contains(3) || seats.contains(4) || seats.contains(5));
            boolean right = !(seats.contains(6) || seats.contains(7) || seats.contains(8) || seats.contains(9));
            boolean middle = !(seats.contains(4) || seats.contains(5) || seats.contains(6) || seats.contains(7));
            if (left && right) res += 2;
            else if (left || right || middle) res += 1;
        }
        res += (n - map.size()) * 2;
        return res;
    }
}
