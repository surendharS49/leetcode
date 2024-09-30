class Solution {
    public int sumBase(int n, int k) {
        String s=Integer.toString(Integer.parseInt(Integer.toString(n),10),k);
    
        int a=Integer.parseInt(s);
        int sum=0;
        while(a>0){
            int d=a%10;
            sum=sum+d;
            a=a/10;
        }
        return sum;
        
    }
}