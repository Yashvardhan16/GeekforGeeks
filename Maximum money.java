class Solution {
    static int maximizeMoney(int N , int K) {
        int ans =0;
       if(N%2==1){
           ans = (N/2+1)*K;
       }else{
           ans = N/2*K;
       }
       return ans;
    }
};
