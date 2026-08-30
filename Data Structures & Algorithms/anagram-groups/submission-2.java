class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<HashMap<Character,Integer>, List<String>> table = new HashMap<>();
        for(int i = 0;i < strs.length;i++){
            HashMap<Character, Integer> count = new HashMap<>();
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                count.put(str.charAt(j), count.getOrDefault(str.charAt(j), 0) + 1);
            }

            table.putIfAbsent(count, new ArrayList<>());
            table.get(count).add(str);
        }

        return new ArrayList<>(table.values());
    }
}
