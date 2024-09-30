class Solution {
    public int findSpecialInteger(int[] arr) {
        int a=(int)(arr.length*0.25);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }

        }
        for(int val:hm.keySet()){
            if(hm.get(val)>a)
            {
                return val;
            }
        }return 0;
    }
}