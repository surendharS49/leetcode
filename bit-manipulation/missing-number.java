class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
       Arrays.sort(nums);
       int v=0;
       int ans=0;
       for(int i=0;i<l;i++)
       {
        if(nums[i]==v){
            v++;
        }else if(nums[i]!=v)
        {
            return v;
        }else{
            return v+1;
        }
       }return v;
    }
}