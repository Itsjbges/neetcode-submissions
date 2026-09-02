class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) <= 1: return len(s)
        set_char = set()
        res = 0

        l,r = 0, 0

        while r < len(s):
            if s[r] in set_char:
                while True:
                    if s[l] == s[r]:
                        l+= 1
                        break
                    else:
                        set_char.remove(s[l])
                        l+= 1
                r+= 1
            else:                
                set_char.add(s[r])
                res = max(res, len(set_char))
                r+= 1
        
        return res


            
            

        