class Solution {
    public boolean detectCapitalUse(String word) {
        char x=word.charAt(0);
        int h=(int) x;
        String k="";
        for(int i=1;i<word.length();i++)
        {
            k=k+word.charAt(i);
        }
        if(word.length()==1){
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
         if(word.equals(word.toUpperCase()))
         {
            return true;
         }
         if(h>=64&& k.equals(k.toLowerCase()))
         {
            return true;
         }
         return false;
        
       
        }
       
    }
