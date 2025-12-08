class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                int sqr = i * i + j * j;
                double root = Math.sqrt(sqr);
                if(sqr <= n * n & Math.ceil(root) == root & Math.floor(root) == root ){
                    ans += 1;
                }
            }
         }
        return ans;    
    }
}