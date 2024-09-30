class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
       } 
       int dig=0;
       for(int j=0;j<nums.length;j++){
        while(nums[j]>0){
            dig=dig+nums[j]%10;
            nums[j]=nums[j]/10;
        }
       }return Math.abs(sum-dig);
    }
}