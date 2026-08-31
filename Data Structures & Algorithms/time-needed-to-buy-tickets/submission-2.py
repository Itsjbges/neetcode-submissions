class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        n = tickets[k]
        res = 0

        for _ in range(n):
            for i in range(len(tickets)):
                if tickets[i] == 0: continue
                res += 1
                tickets[i] -= 1
                if tickets[k] == 0: return res

        return res


