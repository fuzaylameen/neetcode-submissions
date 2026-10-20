class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n= words.length;
        int count []= new int[n];
        for(int i=0; i<n; i++){
            String s= words[i];
            int l=s.length();
            count[i]=(i==0)?0:count[i-1];
            char f= s.charAt(0);
            char e= s.charAt(l-1);
            if ((f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') && (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u')) count[i]++;
       }

       // 1 1 2 3 4 
       int ans[]= new int[queries.length];
       for(int i=0;i<queries.length;i++){
            int no=queries[i][0];
            int s=no;
            int st;
            if(s==0) st=0;
            else st=count[no-1];
            //int st=(count[queries[i][0]]==0)?0:count[queries[i][0]-1];
            int end=count[queries[i][1]];
            ans[i]=end-st;
       }
       return ans;
    }
}