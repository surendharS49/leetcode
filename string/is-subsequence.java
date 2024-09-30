class Solution {
    public boolean isSubsequence(String s, String t) {
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
   
       int count=0;
       int ind=0;
      for(int i=0;i<a.length;i++){
       // int ind=0;
        for(int j=ind;j<b.length;j++){
            if(a[i]==b[j]){
                ind=j+1;
                count++;
                break;
            }
        }
      }
       return count==a.length;
    }
}