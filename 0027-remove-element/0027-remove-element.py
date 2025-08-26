class Solution(object):
    def removeElement(self, nums, val):
        n=0
        for i in range(len(nums)):
            if nums[i]!=val:
                nums[n]=nums[i]
                n+=1
        return n       


       
        