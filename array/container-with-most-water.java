class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            ans=Math.max(ans,h*(r-l));

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}