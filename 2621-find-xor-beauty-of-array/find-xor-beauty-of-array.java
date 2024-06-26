class Solution {
    public int xorBeauty(int[] nums) {
        int ans=0;
       // int res=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}