class Solution {
    public String thousandSeparator(int n) {
        String str=Integer.toString(n);
        int c=0;
        String ans="";
        int l=str.length()-1;
        while(l>=0){
            if(c!=0 &&c%3==0 ){
                ans="."+ans;
                c=0;
            }
            else{
                ans=str.charAt(l)+ans;
                l--;
                c++;
            }
        }return ans;
    }
}