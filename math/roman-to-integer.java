class Solution {
    public int romanToInt(String s) {
      int num[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String str[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      int sum=0;
      int i=0;
      while(s.length()>0){
        while(s.startsWith(str[i])){
            sum+=num[i];
            s=s.substring(str[i].length());
        }
        i++;
      }
    return sum;
    }
}