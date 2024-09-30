import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        int nc = 0;

            for (int num : nums) {
            if (hm.containsKey(num)) {
                int count = hm.get(num);
                nc += count;
                hm.put(num, count + 1);
            } else {
                hm.put(num, 1);
            }
        }

        return nc;
    }
}
