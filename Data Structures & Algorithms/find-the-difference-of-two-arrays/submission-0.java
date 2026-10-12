class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>(),set2=new HashSet<>();
        HashSet<Integer> a=new HashSet<>(),b=new HashSet<>();
        for(int n: nums1) set1.add(n); for(int n:nums2) set2.add(n);
        List<List<Integer>> ans=new ArrayList<>();
        for(int num: set1){if(!set2.contains(num)) a.add(num);}
        for(int num: set2){if(!set1.contains(num)) b.add(num);}
        ans.addAll(Arrays.asList(new ArrayList<>(a), new ArrayList<>(b)));
        return ans;
    }
}