class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
        if(n==0 || n==1) return -1;
        int []arr=findDom(nums);
        int dom=arr[0];
        int freq=arr[1];
        if(freq-1<n/2) return -1;

        int s=0;
        int index=0;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)==dom) s++;
            if(s>(i+1)/2){
                index=i;
                break;
            }
        }
        return ((freq-s)>(n-index-1)/2) ? index:-1;

    }
    public int [] findDom(List<Integer> nums){
        int arr[]=new int[2];
        arr[1]=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>arr[1]) {
                arr[0]=entry.getKey();
                arr[1]=entry.getValue();
            }
        }
        return arr;
    }
    
}

