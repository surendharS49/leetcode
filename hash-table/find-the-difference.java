class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char i:b){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        for(char i:a){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)-1);
            }else{
                hm.put(i,1);
            }
        }
        char str='-';
        for (Map.Entry<Character,Integer> set : hm.entrySet()) {
                if(set.getValue()!=0){
                    return set.getKey();
                }
        }
        return str;
    }
}