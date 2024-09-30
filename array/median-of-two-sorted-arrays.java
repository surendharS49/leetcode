class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        float ans=0;
        int[] arr=new int[n1+n2];
        int x=0;
        for(int i:nums1){
            arr[x++]=i;
        }
        for(int i:nums2){
            arr[x++]=i;
        }
        int n=arr.length;
        Arrays.sort(arr);
        int x1=n/2;
        
        if(n%2==0){
            float a=arr[x1];
        float b=arr[x1-1];
            return (a+b)/2;
        }
            
        
        return arr[x1];
    }
}