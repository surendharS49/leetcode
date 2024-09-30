class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        fun(arr,0,arr.length-1);
        fun(arr,0,k-1);
        fun(arr,k,arr.length-1);
    }
    public void fun(int[] arr,int l,int r){
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}