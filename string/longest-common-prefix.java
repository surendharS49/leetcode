class Solution {
    public String longestCommonPrefix(String[] strs) {
        String out="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                out=out+first.charAt(i);
            }else{
                break;
            }
        }return out;
    }
}