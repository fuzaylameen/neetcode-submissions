class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums,0,target,new ArrayList<>());
        return result;
    }

    private void backtrack(int []nums, int index,int remaining, List<Integer> current){
        if(remaining==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(remaining<0) return;

        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(nums,i,remaining-nums[i],current);
            current.remove(current.size()-1);
        }
    }
}
