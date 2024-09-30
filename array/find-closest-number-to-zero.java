class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<ans || nums[i]==Math.abs(ans)){
                ans=Math.abs(nums[i]);
                res=nums[i];
            }
        }
        return res;
    }
}