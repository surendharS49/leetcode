class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                int a=edges[i][j];
                if(hm.containsKey(a)){
                    hm.put(a,hm.get(a)+1);                    
                }
                else{
                    hm.put(a,1);
                }
            }
        }
        for(Integer key:hm.keySet()){
            if(hm.get(key)>1){
                return key;
            }
        }return 0;
    }
}