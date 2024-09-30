class Solution {
    public String longestPalindrome(String s) {
       
      
        if(s.length()<=1){
            return s;
        }
        String c=s.substring(0,1);
        for(int i=0;i<s.length();i++){
        String odd=fun(s,i,i);
        String even=fun(s,i,i+1);
        if(odd.length()>c.length()){
            c=odd;
        }
        if(even.length()>c.length()){
            c=even;
        }
        }
        return c;
    }
    public static String fun(String s,int j,int i ){
        while(j>=0 && i<s.length() && s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        return s.substring(j+1,i);
    }
}
    