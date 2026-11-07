class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

        StringBuilder SB = new StringBuilder();
        for(int c : count){
            SB.append("#");
            SB.append(c);

        }
        String key = SB.toString();
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<String>());

        }
        map.get(key).add(s); 
        }
         return new ArrayList(map.values());
        
        
    }
}
