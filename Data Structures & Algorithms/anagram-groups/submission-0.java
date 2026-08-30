class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<HashMap<Character,Integer>, List<String>> table = new HashMap<>();
        for(int i = 0;i < strs.length;i++){
            HashMap<Character, Integer> count = new HashMap<>();
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                count.put(str.charAt(j), count.getOrDefault(str.charAt(j), 0) + 1);
            }

            if(table.containsKey(count)){
                table.get(count).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                table.put(count, list);
            }
        }

        List<List<String>> output = new ArrayList<>();
        for(HashMap<Character,Integer> map: table.keySet()){
            output.add(table.get(map));
        }
        return output;
    }
}
