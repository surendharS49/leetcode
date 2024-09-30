class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        int ans1=-1;
        int arr[]=new int[2];
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans1=mid;
                end=mid-1;
            }else if(nums[mid]>target){
                end=mid-1;

            }else{
                start=mid+1;

            }

        } int start1=0;
        int end1=nums.length-1;
        int mid1;
        int ans2=-1;
        while(start1<=end1){
           mid1=start1+(end1-start1)/2;
            if(nums[mid1]==target){
                 ans2=mid1;
                start1=mid1+1;
            }else if(nums[mid1]>target){
                end1=mid1-1;

            }else{
                start1=mid1+1;

            }
        }
        arr[0]=ans1;
        arr[1]=ans2;
        return arr;
        
    }
}