class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int lis[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            lis[i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }
        int m=Integer.MIN_VALUE;
        for(int f:lis){
            m=Math.max(f,m);
        }
        return m;
    }
}