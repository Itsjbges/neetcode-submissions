class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen_numbers = []
        result = []

        for index, num in enumerate(nums):
            searched_num = target - num
            if searched_num in seen_numbers:
                return [seen_numbers.index(searched_num), index]
            seen_numbers.append(num)