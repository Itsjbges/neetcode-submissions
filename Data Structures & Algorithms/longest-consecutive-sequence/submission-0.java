class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int len = 0;
        for(int num: set){
            if(set.contains(num -1)){
                continue;
            }
            int j = 1;
            while(true){
                if(set.contains(num +j)){
                    j++;
                }else{
                    len = Math.max(len, j);
                    break;
                }
            }

        }

        return len;

    }
}
