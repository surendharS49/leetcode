class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr1){
            int x=1;
            while(x<=Integer.toString(i).length()){
                String str=Integer.toString(i).substring(0,x);
                set.add(Integer.parseInt(str));
                x++;
            }
            
        }
        int c=0;
        for(int i:arr2){
            int x=1;
            while(x<=Integer.toString(i).length()){
                String str=Integer.toString(i).substring(0,x);
                if(set.contains(Integer.parseInt(str))){
                    c=Math.max(c,str.length());
                    
                }
                x++;
            }
        }
    
    return c;
}}