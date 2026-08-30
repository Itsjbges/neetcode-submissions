class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.replace(" ", "").lower()
        l,r = 0, len(s) - 1

        while (l < r):
            left_c = s[l]
            right_c = s[r]

            if not left_c.isalnum():
                l +=1
                continue
            
            if not right_c.isalnum():
                r-= 1
                continue

            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        
        return True