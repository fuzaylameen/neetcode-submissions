class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        create(nums,0,new ArrayList<>());
        return result;
    }

    private List<List<Integer>> result=new ArrayList<>();
    private void create(int []nums,int index,List<Integer> current){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            create(nums,i+1,current);
            current.remove(current.size()-1);
        }
    }
}
