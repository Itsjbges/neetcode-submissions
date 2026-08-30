class Solution:
    def isValid(self, s: str) -> bool:
        parentheses = {")": "(", "]": "[", "}": "{"}
        stack = []

        for x in s:
            if x in parentheses.keys():
                corres_parentheses = parentheses[x]
                if not stack or stack[-1] != corres_parentheses:
                    return False
                stack.pop()
            else:
                stack.append(x)
        
        if stack:
            return False

        return True