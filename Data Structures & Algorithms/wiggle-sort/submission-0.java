class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int [] res=new int[n];
        int h=n/2;
        int j=0;
        for(int i=0; i<(n/2); i++){
            res[j++]=nums[i];
            res[j++]=nums[h++];
        }
        for(int i=0; i<n;i++){
            nums[i]=res[i];
        }

    }
}

// 0,1,2
// 1,2,3,4,5,6
// 1,4,2,5,3,6

// 1,2,3,4,5
// 1,4,2,5,3
// 1,3,2,4