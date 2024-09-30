class Solution {
    public void reverseString(char[] s) {
       
        int b=0;
        int c=s.length-1;
        while(b<c){
            char temp=s[c];
            s[c]=s[b];
            s[b]=temp;
            b++;
            c--;
        }
        for(int j=0;j<s.length;j++){
            System.out.print(s[j]);
        }
        
    }
}