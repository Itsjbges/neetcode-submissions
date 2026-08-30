class Solution { //aabbaa
    public boolean isPalindrome(String s) {
        int j = s.length()-1;
        int l = 0;

        for(int i = 0;i < s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                l++;
            }
        }

        for(int i = 0; i < l/2;){
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if(!Character.isLetterOrDigit(a)){
                i++;
                continue;
            }else if(!Character.isLetterOrDigit(b)){
                j--;
                continue;
            }

            if(a != b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
