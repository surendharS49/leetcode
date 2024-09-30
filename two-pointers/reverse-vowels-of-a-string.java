import java.util.HashSet;

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();  
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');        
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(chars[i]))
                i++;
            while (i < j && !vowels.contains(chars[j]))
                j--;
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}
