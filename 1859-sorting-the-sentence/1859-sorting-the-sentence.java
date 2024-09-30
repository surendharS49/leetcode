class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        
        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            sortedWords[index] = word.substring(0, word.length() - 1);
        }
        
       
        StringBuilder result = new StringBuilder();
        for (String word : sortedWords) {
            result.append(word).append(" ");
        }
        
        return result.toString().trim();
    }
}
