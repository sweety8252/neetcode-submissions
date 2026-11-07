class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String S = strs[0];

        if(strs.length == 0) return "";

        for(int i = 1 ; i< n ; i++){
            while(strs[i].indexOf(S) != 0){
                S = S.substring(0 , S.length()-1);
            }
        }
        return S;
        
    }
}