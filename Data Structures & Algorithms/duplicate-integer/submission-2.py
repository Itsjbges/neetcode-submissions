class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        gesehen_nummer = set()

        for num in nums:
            if num in gesehen_nummer:
                return True

            gesehen_nummer.add(num)
        
        return False
        