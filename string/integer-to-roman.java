class Solution {
    public String intToRoman(int n) {
        int[] num={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strr={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int x=0;
        String str="";
        while(n>0){
            while(n-num[x]>=0){
                str+=strr[x];
                n-=num[x];
            }
            x++;
        }
        return str;
    }
}