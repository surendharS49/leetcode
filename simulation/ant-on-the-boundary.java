class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int sum=0;
        for(int i:nums){
            sum=sum+i;
            if(sum==0){
                count++;
            }
        }
        return count;
    }
}