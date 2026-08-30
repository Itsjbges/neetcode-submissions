class Solution { 
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            char l = s.charAt(i);
            char r = s.charAt(j);
            
            if (!Character.isLetterOrDigit(l)) {
                i++;
            } else if (!Character.isLetterOrDigit(r)) {
                j--;
            } else {
                if (l != r) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
