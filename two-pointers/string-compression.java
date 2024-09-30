class Solution {
    public int compress(char[] chars) {
        // //Arrays.sort(chars);
        // int i=0;
        // int j=0;
        // HashMap<Character,Integer>hm=new HashMap<>();
        // for(char ch:chars){
        //     if(hm.containsKey(ch)){
        //         hm.put(ch,hm.get(ch)+1);
        //     }else{
        //         hm.put(ch,1);
        //     }
        // }
        // // while(j<chars.length){
        // //     chars[i]=Integer.toString(hm.get(chars[j])).charAt(0);
        // //     j=j+hm.get(chars[i]);
        // //     i+=2;
        // // }
        // // return i;
        // for(char ch:hm.keySet()){
        //     chars[i++]=ch;
        // int ans=hm.get(ch);
        // if(ans>1){
        //     for (char c : Integer.toString(ans).toCharArray()) {
        //             chars[i++] = c;
        //         }
        // }}
        // return i;

        int i=0;
        int j=0;
    
        while(j<chars.length){
            char c=chars[j];
            int k=0;
            while(j < chars.length && c==chars[j]){
                j++;
                k++;
            }
            chars[i++]=c;
            if(k>1){
                for(char x:Integer.toString(k).toCharArray()){
                    chars[i++]=x;
                }
            }
        }
        return i;
    }
}