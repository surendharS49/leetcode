class Solution {
    public int minimizedStringLength(String s) {
       
        int n=s.length();
        String s1="";
        //int count=0;
        for(int i=0;i<n;i++){
            boolean a=false;
            for(int j=i+1;j<n;j++)
            { 
                if(s.charAt(i)==s.charAt(j)){
                    a=true;
                    break;
                    //count++;
                }
            }
            if (!a) {
                s1 += s.charAt(i);
            }}
        
        return s1.length();
    }
}