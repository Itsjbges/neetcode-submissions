class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = set(nums)
            
        res = 0

        for num in nums:
            if num - 1 in nums: continue
            tmp_res = 1
            searching = num + 1
            while (True):
                if searching in nums:
                    tmp_res += 1
                    searching += 1
                else:
                    break

            if tmp_res > res:
                res = tmp_res

        return res
            
