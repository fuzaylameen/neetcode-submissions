class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n= nums.length;
        for(int i=0; i<n; i++){
            int k=nums[i]-1;
            while(k>1){
                if(isPrime(k)){
                    int temp=nums[i]-k;
                    if(i==0 || temp>nums[i-1]) {
                        nums[i]=temp;
                        break;
                    }
                }
                k--;
            }
            if(i!=0 && nums[i]<=nums[i-1]) return false;
        }
        return true;

    }
    public boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}