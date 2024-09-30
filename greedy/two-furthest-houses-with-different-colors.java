class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0;
        
        for (int i = 0; i < colors.length; i++) {
            for (int j = colors.length - 1; j > i; j--) {
                if (colors[i] != colors[j]) {
                    ans = Math.max(ans, Math.abs(i - j));
                    break;
                }
            }
        }
        
        return ans;
    }
}
