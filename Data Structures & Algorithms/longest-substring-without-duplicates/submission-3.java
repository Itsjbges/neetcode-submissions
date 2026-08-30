class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, r = 0;
        int res = 0;
        while(r < s.length()){
            if(set.contains(s.charAt(r))){
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}
