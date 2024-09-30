class Solution {
    public int hIndex(int[] citations) {
      Arrays.sort(citations);
      int n=citations.length;
      int s=0;
      int e=citations.length-1;
      while(s<=e){
        int mid=s+(e-s)/2;
        if(citations[mid]<n-mid)
        {     s = mid+1;   }
        else{
            e=mid-1;
        }
      }
      return n-s;
    }
}