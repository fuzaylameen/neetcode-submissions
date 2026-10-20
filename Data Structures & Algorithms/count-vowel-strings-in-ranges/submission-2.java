class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n= words.length;
        int count []= new int[n];
        for(int i=0; i<n; i++){
            String s= words[i];
            count[i]=(i==0)?0:count[i-1];
            char f= s.charAt(0);
            char e= s.charAt(s.length()-1);
            if ((f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') && (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u')) count[i]++;
       }

       // 1 1 2 3 4 
       int ans[]= new int[queries.length];
       for(int i=0;i<queries.length;i++){
            int st=(queries[i][0]==0)?0:count[queries[i][0]-1];
            int end=count[queries[i][1]];
            ans[i]=end-st;
       }
       return ans;
    }
}