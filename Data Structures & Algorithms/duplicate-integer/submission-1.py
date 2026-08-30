class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        gesehen_nummer = []

        for i in range(len(nums)):
            if nums[i] in gesehen_nummer:
                return True

            gesehen_nummer.append(nums[i])
        
        return False
        