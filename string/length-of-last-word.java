class Solution {
    public int lengthOfLastWord(String s) {
    String arr[]=s.split(" ");
    int x=arr.length;
    int a=arr[x-1].length();

    return a;
        
    }
}