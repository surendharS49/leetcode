class Solution {
    public int unequalTriplets(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
            for(int k=j;k<n;k++){
            if(nums[i] != nums[j] && nums[i] != nums[k] &&  nums[j] != nums[k]){
                count++;
            }
        }
        }
        }return count;
    }
}