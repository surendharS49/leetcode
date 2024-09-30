class Solution {
    public int heightChecker(int[] heights) {
        int[] e=Arrays.copyOf(heights,heights.length);
        Arrays.sort(e);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(e[i]!=heights[i]){
                ans++;
            }
        }
        return ans;
    }
}