class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int k=Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<nums[i]) k=stack.pop();
            if(nums[i]<k) return true;
            stack.push(nums[i]);
        }
        return false;
    }
}
