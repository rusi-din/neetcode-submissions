import collections


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        sets = {}
        output = []

        for num in nums:
            sets[num] = sets.get(num, 0) + 1

        sorted_list = sorted(sets.items(),key=lambda x: x[1],reverse=True)

        for i in range(k):
            key, _ = sorted_list[i]
            output.append(key)
        return output
