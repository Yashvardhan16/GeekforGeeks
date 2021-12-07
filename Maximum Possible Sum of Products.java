class Solution 
{ 
    long MaxSum(long []A, long []B, int N) 
    { 
        long ans =0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++){
            
            ans += A[i]*B[i];
        }
        return ans;
    }
    
} 
