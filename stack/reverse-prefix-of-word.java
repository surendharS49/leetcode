class Solution {
    public String reversePrefix(String word, char ch) {
        int x=0;
        int len=word.length();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                x=i;
                break;
            }
        }String s="";
        int y=x;
        while(x>=0){
            s=s+word.charAt(x);
            x--;
        }String w="";
    
        for(int j=y+1;j<=len-1;j++){
            w=w+word.charAt(j);
            
        }
        return s+w;
    }
}