class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
