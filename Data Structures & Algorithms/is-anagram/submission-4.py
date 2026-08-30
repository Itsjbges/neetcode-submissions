class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dict_s = {}
        for c in s:
            if c in dict_s.keys():
                dict_s[c] += 1
            else:
                dict_s[c] = 1
        
        for c in t:
            if c in dict_s.keys():
                dict_s[c] -= 1
                if dict_s[c] == 0 :
                    dict_s.pop(c)
            else:
                return False
        
        if dict_s:
            return False

        return True