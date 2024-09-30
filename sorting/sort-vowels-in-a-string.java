class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>arr=new ArrayList<>();
         char[] ch=s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(ch[i]=='A' || ch[i]=='E'|| ch[i]=='I' || ch[i]=='O' ||ch[i]=='U' || ch[i]=='a' ||
             ch[i]=='e' ||ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'){
                 arr.add(ch[i]);
                 ch[i]='_';

                }
            }char ans[]=new char[arr.size()];
            for(int i=0;i<arr.size();i++){
                ans[i]=arr.get(i);
            }
            Arrays.sort(ans);
            int x=0;
           
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='_'){
              ch[i]=ans[x++];
                }
            }
         String str="";
        for(char a:ch){
            str+=a;
        }  
        return str;    
    }
}