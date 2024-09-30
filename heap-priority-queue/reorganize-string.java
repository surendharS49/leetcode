class Solution {
    public String reorganizeString(String s) {
        String str="";
        // for(int i=0;i<s.length()-1;i=i+2){
        //     if(s.charAt(i)==s.charAt(i+1)){
        //         if(s.charAt(i+1)!=s.charAt(i+2)){
        //             str=str+s.charAt(i)+s.charAt(i+2)+s.charAt(i+1);
        //         }
        //     }
        // }
        int[][] m = new int[26][2];
        for (int i = 0; i < 26; ++i) m[i][0] = i;
        char[] ch = s.toCharArray();
        for (char c : ch) m[c - 'a'][1]++;
        Arrays.sort(m, (a, b) -> b[1] - a[1]);

        int n = s.length();
        if (m[0][1] > (n + 1) / 2) return "";

        char[] result = new char[n];
        int idx = 0;
        
        for (int i = 0; i < 26; i++) {
            int count = m[i][1];
            char c = (char) (m[i][0] + 'a');
            for (int j = 0; j < count; j++) {
                if (idx >= n) idx = 1; // start filling at odd index after even indices are filled
                result[idx] = c;
                idx += 2;
            }
        }

        return new String(result);
    }
}