class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]='_';
            }
        }
        Arrays.sort(nums);
        int a=0;
        for(int i:nums){
            if(i!='_'){
                a++;
            }
        }
        return a;
    }
}