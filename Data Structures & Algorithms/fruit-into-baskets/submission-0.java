class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0;
        int count =0,max=0;
        HashSet<Integer> set= new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;

        while(r<fruits.length){
            if(map.getOrDefault(fruits[r],0)==0 && c==2){
                map.put(fruits[l],map.get(fruits[l])-1);
                while(map.get(fruits[l])>0){
                    l++;
                    map.put(fruits[l],map.get(fruits[l])-1);
                } l++;c--;
            }
            if(map.getOrDefault(fruits[r],0)==0) c++;
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            count=r-l+1;
            max=(count>max)?count:max;
            r++;

        }
        return max;
    }
}