class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        if not arr: return arr
        right_val = arr[-1]
        for i in range(len(arr)-1, -1, -1):
            if arr[i] > right_val:
                tmp = arr[i]
                arr[i] = right_val
                right_val = tmp
                continue
            arr[i] = right_val
        
        arr[-1] = -1
        return arr