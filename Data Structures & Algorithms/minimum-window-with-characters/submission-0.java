class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0) + 1);
        }

        int have = 0, need = countT.size();
        int l = 0;
        String res = "";
        int len = Integer.MAX_VALUE;
        for(int r = 0; r < s.length();r++){
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c,0) + 1);

            if(countT.containsKey(c) && freq.get(c) == countT.get(c)){
                have++;
            }

            while(have == need){
                if( (r -  l + 1) < len){
                    res = s.substring(l, r+1);
                    len = r - l + 1;
                }

                char leftC = s.charAt(l);
                freq.put(leftC, freq.get(leftC) -1);

                if(countT.containsKey(leftC) && freq.get(leftC) < countT.get(leftC)){
                    have--;
                }
                l++;
            }
        }
        return len == Integer.MAX_VALUE?"":res;
    }
}
