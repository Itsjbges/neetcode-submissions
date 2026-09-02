class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        close_parentheses = {"}": "{", "]": "[", ")": "("}

        for x in s:
            if x in close_parentheses:
                if stack and stack[-1] == close_parentheses[x]:
                    stack.pop()
                else:
                    return False
                
            else:
                stack.append(x)
        
        if stack:
            return False
        return True