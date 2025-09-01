class Solution:
    def getLeastFrequentDigit(self, n: int) -> int:
        d = {}
        num = n
        while num > 0:
            rem =  num % 10
            if rem in d:
                d[rem] = d[rem] + 1
            else:
                d[rem] = 1
            num = num//10
        least =  float('inf')  
        freq = float('inf') 
        for i in d:
            if d[i] <= freq:
                if d[i] == freq:
                    if i < least:
                        least = i
                else:
                    least = i
                    freq = d[i]
        return least                          

             


        