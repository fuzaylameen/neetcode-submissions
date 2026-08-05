class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        for(int i=1;i<=rowIndex;i++){
            num.add(1);
            for(int j=i-1;j>0;j--){
                num.set(j,num.get(j)+num.get(j-1));
            }
        }
        return num;
        
    }
}