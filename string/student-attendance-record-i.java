class Solution {
    public boolean checkRecord(String s) {
        int l=s.length();
      int i=0;
      int Ac=0;
      while(i<l){
        if(s.charAt(i)=='A'){
            Ac++;
        }
        i++;
      }int j=0;
      while(j<l-2){
        if(s.charAt(j)=='L' && s.charAt(j+1)=='L' && s.charAt(j+2)=='L'){
            return false;
        
        }
        j++;
      }
      if(Ac<2){
        return true;
      }
return false;
        
    }
}