class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        s=str.toString();
        int n=s.length();
        String st="";
        int i=0;
        int c=0;
        while(i<n){
            if(c==k && str.charAt(i)!='-'){
                st+='-';
                c=0;
            }if(str.charAt(i)!='-'){
                st=st+str.charAt(i);
                i++;
                c++;
            }else{
                i++;
            }
        }
         StringBuilder ar=new StringBuilder(st);
         ar=ar.reverse();
         return ar.toString();
        
}}