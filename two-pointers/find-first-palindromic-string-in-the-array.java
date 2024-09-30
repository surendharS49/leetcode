class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int n=words[i].length();
            String str="";
            for(int j=n-1;j>=0;j--){
                str=str+words[i].charAt(j);
            }
            if(words[i].equals(str)){
                return words[i];
            }
        }return "";      
    }
}