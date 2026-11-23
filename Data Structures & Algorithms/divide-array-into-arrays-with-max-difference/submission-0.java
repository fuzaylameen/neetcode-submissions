class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int row=nums.length/3;
        int col =3;
        Arrays.sort(nums);
        int [][] res= new int[row][col];

        int l=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<3; j++){
                if(j==2){
                    if((j==2)&&(nums[l]-res[i][0])>k) return new int[0][];
                }
                res[i][j]=nums[l++];
            }
        }
        return res;
    }
}