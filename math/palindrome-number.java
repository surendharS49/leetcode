class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s=new StringBuilder(Integer.toString(x));
        s.reverse();
        return s.toString().equals(x+"");
    }
}