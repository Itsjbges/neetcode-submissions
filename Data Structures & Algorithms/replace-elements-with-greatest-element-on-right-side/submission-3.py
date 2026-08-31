class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        if not arr: return arr
        right_val = -1
        for i in range(len(arr)-1, -1, -1):
            current_val = arr[i]
            
            arr[i] = right_val

            right_val = max(right_val, current_val)
        
        return arr