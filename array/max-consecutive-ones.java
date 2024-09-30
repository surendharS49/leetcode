class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        //int i=0;
        int j=nums.length-1;
        int count=0;
      for(int i:nums)
            if(i==1){
                count++;
                ans=Math.max(ans,count);
            
            }else{
                count=0;
            }
            
            // j--;
            // i++;
        
        return ans;
    }
}