class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int s=0;
        int l=nums.length-1;
        if(nums.length==1){
            if(nums[0]==target){
                return true;
            }
        }
        int mid;
        while(s<=l){
            mid=(s+l)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(target<nums[mid]){
                l=mid-1;
            }
            else
                s=mid+1;
        }
        return false;
    }
}