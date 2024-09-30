//import java.util.Colleections;
import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        int rev[]=new int[nums.length];
        int x=0;
        for(int i=nums.length-1;i>=0;i--){
            rev[x++]=nums[i];
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:rev){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }

        }int ans[]=new int[rev.length];
        int val[]=new int[rev.length];
        int z=0;
        for(int a=0;a<rev.length;a++){
            ans[z]=rev[a];
            val[z]=hm.get(rev[a]);
            z++;
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length-1;j++){
                if(val[j]>val[j+1]){
                    int temp=val[j];
                    val[j]=val[j+1];
                    val[j+1]=temp;
                    int temp2=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp2;
                }
            }
        }
        return ans;
    }
}