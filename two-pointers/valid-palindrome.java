class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = s.length();
        int i = 0;
        int n = l - 1;
        while (i < n) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(n))) {
                n--;
                continue;
            }
            if (s.charAt(i) != s.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}
