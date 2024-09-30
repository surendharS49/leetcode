// class Solution {
//     public static boolean isanagram(String a,String b){
//         if (a.length() != b.length()) {
//             return false;
//         }
//         int arr[]=new int[26];
//         for(char ch: a.toCharArray()){
//             arr[ch-'a']++;
//         }
//         for(char ch: b.toCharArray()){
//             arr[ch-'a']--;
//         }
//         for(int i=0;i<26;i++){
//             if(arr[i]!=0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public List<List<String>> groupAnagrams(String[] strs) {
//         int n=strs.length;
//         List<List<String>>arr=new ArrayList<>();
//        Arrays.sort(strs);
//         for(int i=0;i<n;i++){
        
//             if(strs[i]!="*"){
//             ArrayList<String>lis=new ArrayList<>();
//            lis.add(strs[i]);
//             for(int j=i+1;j<n;j++){
//                 if(strs[j]!="*"){
//                 if(isanagram(strs[i],strs[j])){
//                     lis.add(strs[j]);
//                     strs[j]="*";
//                 }
//                 }
//             }
            
//             arr.add(lis);
//         }}
//         return arr;
//     }
// }


class Solution{
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList<String>>hm=new HashMap<>();
       for(int i=0;i<strs.length;i++){
        char[] c=strs[i].toCharArray();
        Arrays.sort(c);
        String a=Arrays.toString(c);
        if(!hm.containsKey(a)){
            hm.put(a,new ArrayList<>());
        }
            hm.get(a).add(strs[i]);
        
       } 
       return new ArrayList<>(hm.values());
    }
}