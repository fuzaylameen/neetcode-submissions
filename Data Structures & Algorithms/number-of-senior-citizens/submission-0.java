class Solution {
    public int countSeniors(String[] details) {
        if(details.length==0) return 0;
        int count=0;
        for(String temp:details){
            String str;
            str=temp.substring(11, 13);
            int num = Integer.parseInt(str);
            if(num>60) count++;
        }
        return count;
        
    }
}