/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0;
        int h=n;
        while(l<h){
            int m=l+(h-l)/2;
            if(isBadVersion(m)==false){
                l=m+1;

            }else{
                h=m;
            }
        }
        return l;

    }
}