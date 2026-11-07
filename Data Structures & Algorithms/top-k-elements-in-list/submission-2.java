class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length+1];

        Map<Integer, Integer> frequencymap = new HashMap<>();

        for(int n : nums){
            frequencymap.put(n , frequencymap.getOrDefault(n , 0)+1);
        }

        for(int Key : frequencymap.keySet()){
            int frequency = frequencymap.get(Key);

            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(Key);

        }

        int[] res = new int[k];
        int count = 0;

        for(int pos = bucket.length -1 ; pos >= 0 && count < k ; pos--){
           if(bucket[pos] != null){
            for(int integer : bucket[pos]){
                if(count == k){
                    break;
                }
                res[count++] = integer;
            }
           }
        }

return res;
        
    }
}
