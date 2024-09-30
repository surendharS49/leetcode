class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        int mid;
        if(x==1){
                return 1;
               
             }
        while(start<=end){
            mid=(start+((end-start)/2));
            if(mid == x / mid){
                return mid;

            }else if(mid > x / mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}