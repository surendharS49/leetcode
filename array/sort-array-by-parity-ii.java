class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int ev[]=new int[n/2];
        int od[]=new int[n/2];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ev[x++]=nums[i];
            }else{
                od[y++]=nums[i];
            }
        }
        x=0;
        y=0;
         for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=ev[x++];

            }else{
                ans[i]=od[y++];
            }
         }
         return ans;
    }
}