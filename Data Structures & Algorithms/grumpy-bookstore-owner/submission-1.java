class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int total=0;
        for(int i=0; i<n; i++){
            if(grumpy[i]==0) total+=customers[i];
        }

        int l=0;
        int sum=0; int max=0;
        for(int r=0; r<n; r++){

            if(grumpy[r]==1) total+=customers[r];
            if(r<minutes-1) continue;

            max=total>max?total:max;

            if(grumpy[l]==1) total-=customers[l];
            l++;
        }
        return max;


    }
}