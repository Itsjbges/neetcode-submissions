class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(hashS.containsKey(sChar)){
                hashS.put(sChar, hashS.get(sChar) + 1);
            }else{
                hashS.put(sChar, 1);
            }

            if(hashT.containsKey(tChar)){
                hashT.put(tChar, hashT.get(tChar) + 1);
            }else{
                hashT.put(tChar, 1);
            }
        }
        
        return hashT.equals(hashS);

    }
}
