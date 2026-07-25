class Solution {
    public int majorityElement(int[] nums) {
        int ele=-1,count=0;
        for(int i:nums){
            if(count==0){
                ele=i;
                count++;
            }
            if(i==ele) count++;
            else count--;
        }
        return ele;
        
    }
}