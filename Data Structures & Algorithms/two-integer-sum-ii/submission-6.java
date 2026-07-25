class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int [] res=new int[2];
        if(len<=1) return res;
        int sum=0;
        int i=0,j=len-1;
        while(true){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
            else if(sum>target) j--;
            else i++;

        }

        return res;
    }
}
