class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                ans=Math.max(ans,nums[i]^nums[j]);
                }
            }
        }
     return ans;  
    }
}