class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < nums.length + 1;i++){
            freq[i] = new ArrayList<>();
        }

        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(int key: count.keySet()){
            freq[count.get(key)].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = freq.length-1;i > 0;i--){
            for(int n: freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
    
        }

        return res;
    }
}
