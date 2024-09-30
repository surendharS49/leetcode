class Solution {
     void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
       int n=nums.length;
       int i1=-1;
       int i2=-1;
       for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            i1=i;
            break;
        }
       }
       if(i1==-1){
        reverse(nums,0);
       }else{
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[i1]){
                i2=i;
                break;
            }
        }
        swap(nums,i1,i2);
        reverse(nums,i1+1);
       }
    }
}