class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       int n1=Integer.MAX_VALUE;
        for(int i:nums1){
            n1=Math.min(i,n1);
        }
        int n2=Integer.MAX_VALUE;
        for(int j:nums2){
            n2=Math.min(j,n2);
        }
        return n2-n1;
    }
}