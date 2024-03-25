class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        d = {}
        res = []
        for i in nums:
            if i in d:
                d[i] = d[i] + 1
            else:
                d[i] = 1
        for i in d:
            if d[i] >= 2:
                res.append(i)
        return res