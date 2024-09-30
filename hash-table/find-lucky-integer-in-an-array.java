class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=-1;
        int l=arr.length;
        for(int a:arr){
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }else{
                hm.put(a,1);
            }
        }
        for(int val:hm.keySet()){
            if(hm.get(val)==val){
                ans=Math.max(ans,val);
            }
        }return ans;
    }
}