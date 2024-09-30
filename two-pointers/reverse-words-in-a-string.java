class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        int n=arr.length-1;
        String st="";
        while(n>=0) 
        {
            st+=arr[n].trim();
            if(n>0){
                st+=" ";
            }
            n--;
        }
      return st.trim();  
    }
}