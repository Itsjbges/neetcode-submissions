class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        gesehen_nummer = {}
        for index, nummer in enumerate(nums):
            gesucht = target - nummer

            if gesucht in gesehen_nummer:
                return [gesehen_nummer[gesucht], index]

            gesehen_nummer[nummer] = index