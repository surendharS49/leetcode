class Solution {
    public int findDuplicate(int[] nums) {
        int num=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int ans=nums[i]^num;
            if(ans!=0){
                num=nums[i];
            }else
                break;
            
        }
        return num;
    }
}