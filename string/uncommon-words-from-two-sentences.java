class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        HashMap<String,Integer>hm=new HashMap<>();
        for(String s:arr1){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }else{
                hm.put(s,1);
            }
        }
        for(String s:arr2){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }else{
                hm.put(s,1);
            }
        }ArrayList<String>ans=new ArrayList<>();
        for(String key :hm.keySet()){
            if(hm.get(key)==1){
                ans.add(key);
            }
        }
        String[] a=new String[ans.size()];
        for(int i=0;i<ans.size();i++){a[i]=ans.get(i);}
        return a;
    }
}