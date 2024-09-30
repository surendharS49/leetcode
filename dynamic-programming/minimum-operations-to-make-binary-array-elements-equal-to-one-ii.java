class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        int f=0;
        for(int i=0;i<n;i++){
            if(nums[i]==f){
                count++;
                f=1-f;
            }
        }
        return count;
    }
}