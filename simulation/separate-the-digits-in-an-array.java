class Solution {
    public int[] separateDigits(int[] nums) {
    //Stack<Integer> st=new Stack<>();
    StringBuilder str=new StringBuilder();
    String sr="";
    for(int i=0;i<nums.length;i++ ){
        sr=sr+Integer.toString(nums[i]);
    } 
    int arr[]=new int[sr.length()];
    for(int j=0;j<sr.length();j++){
        arr[j]=Character.getNumericValue(sr.charAt(j));
    }return arr;
    }
}