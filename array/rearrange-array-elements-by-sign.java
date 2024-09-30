class Solution {
    public int[] rearrangeArray(int[] nums) {
         int n=nums.length;
        int arr[]=new int[n];
       int o=0;
       int e=1;
        for(int i=0;i<n;i++){
           
             
                    if(nums[i]>0){
                        arr[o]=nums[i];
                       o=o+2;
                    }else if(nums[i]<0){
                        arr[e]=nums[i];
                        e=e+2;
                      
                    }

                
            }
        return arr;
        
    }
}