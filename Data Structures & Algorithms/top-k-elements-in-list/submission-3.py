class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        buckets = [[] for i in range(len(nums) + 1)]
        numFreq = Counter(nums)

        for key, value in numFreq.items():
            buckets[value].append(key)

        res = []

        for i in range(len(buckets) - 1, -1, -1):
            for n in buckets[i]:
                if len(res) == k:
                    break
                else:
                    res.append(n)

        return res