class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       // HashMap<Character,Integer>hm=new HashMap<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            hm.put(allowed.charAt(i),1);
        }
        int count=0;
       
           for (int j = 0; j < words.length; j++) {
            String str = words[j];
            boolean consistent = true;
            for (int k = 0; k < str.length(); k++) {
                if (!hm.containsKey(str.charAt(k))) {
                    consistent = false;
                    break; 
                }
            }
            if (consistent) {
                count++;
            }
        }
    return count;
    }}
