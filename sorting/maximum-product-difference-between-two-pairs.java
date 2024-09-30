class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min1=nums[0]*nums[1];
        int min2=nums[n-1]*nums[n-2];
        return min2-min1;
        
    }
}