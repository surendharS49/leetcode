class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
      int ans=-1;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]<nums[j]){
                int d=nums[j]-nums[i];
                ans=Math.max(ans,d);
            }
        }
      }
        return ans;
    }
}