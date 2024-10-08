class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = Integer.MIN_VALUE;
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int min = arrays.get(0).get(0);
        for (int i = 1; i < arrays.size(); i++) {
            ans = Math.max(ans,Math.abs(max-arrays.get(i).get(0)));
            ans = Math.max(ans,Math.abs(min-arrays.get(i).get(arrays.get(i).size() - 1)));
            max = Math.max(max,arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min,arrays.get(i).get(0));
        }
        return ans;
    }
}