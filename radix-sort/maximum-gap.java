class Solution {
    public int maximumGap(int[] nums) {
    Arrays.sort(nums);
    if(nums.length==1){
        return 0;
    }
    int ans=0;
    for(int i=0;i<nums.length-1;i++){
        int sum=Math.abs(nums[i]-nums[i+1]);
        ans=Math.max(ans,sum);
    }return ans;
    }
}