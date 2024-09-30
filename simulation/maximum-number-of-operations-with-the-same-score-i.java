class Solution {
    public int maxOperations(int[] nums) {
        int sum=nums[0]+nums[1];
        int count=1;
        for(int j=2;j<nums.length-1;j++){
            if(nums[j]+nums[j+1]!=sum){
                j++;
                break;
            }else{
                count++;
                j++;
            }
        }
        return count;
    }
}