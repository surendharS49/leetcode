class Solution {
    public String defangIPaddr(String address) {
        StringBuilder z=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                z.append("[.]");
            }else
            {
                z.append(address.charAt(i));
            }

        }return z.toString();
    }
}