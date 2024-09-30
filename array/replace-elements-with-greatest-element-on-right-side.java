class Solution {
    public int[] replaceElements(int[] arr) {
        int i=arr.length-1;
        
        int max=-1;
        
        while(i>=0){
            if(arr[i]>max){
                int oldmax=max;
                max=arr[i];
                arr[i]=oldmax;
            }
            else{
                arr[i]=max;
            }
            i--;
        }
        return arr;
    }
}