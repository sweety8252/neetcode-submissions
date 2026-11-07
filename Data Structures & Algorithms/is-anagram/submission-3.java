class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) return false;

         int[] S2 = new int[26];
         for(int i = 0 ; i< s.length() ; i++){
            S2[s.charAt(i)-'a']++;
            S2[t.charAt(i)-'a']--;
         }

         for( int count : S2){
            if(count != 0) return false;
         }
         return true;

    }
    
}
