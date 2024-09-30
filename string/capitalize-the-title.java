class Solution {
    public String capitalizeTitle(String title) {
        String arr[]=title.split(" ");
        String str[]=new String[arr.length];
        int i=0;
        for(String s:arr){
            arr[i++]=s.toLowerCase();
        }
        int j=0;
        for(String y:arr){
            if(y.length()>2){
            arr[j++]=y.substring(0,1).toUpperCase()+y.substring(1);}
            else{
                arr[j++]=y.toLowerCase();
            }
        }
        String x="";
        for(String u:arr){
            x+=u+" ";
        }
        return x.trim();
    }
}