class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        res = []

        for i in range(len(nums)):
            res.insert(i, nums[i])
            res.insert(i + len(nums), nums[i])
        return res
        