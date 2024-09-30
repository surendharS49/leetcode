class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int x=0;
        int in=0;
        for(int i=0;i<nums.length;i++){
           if(i%2==0){
            ans[x++]=nums[in++];
           } else{
            ans[x++]=nums[n++];
           }

        }
      return ans;  
    }
}