class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max=0;
        HashMap<String,Integer> map= new HashMap<>();

        for(int nums : arr1){
            String act=String.valueOf(nums);
            int n=act.length();
            String s="";
            for(int i=0; i<n; i++){
                s+=act.charAt(i);
                map.put(s,1);
            }
        }

        for(int nums : arr2){
            String act=String.valueOf(nums);
            int n=act.length();
            String s="";
            for(int i=0; i<n; i++){
                s+=act.charAt(i);
                int length=s.length();
                if(map.getOrDefault(s,0)==1) max=(length>max)?length:max;
            }
        }

        return max;
        
    }
}
