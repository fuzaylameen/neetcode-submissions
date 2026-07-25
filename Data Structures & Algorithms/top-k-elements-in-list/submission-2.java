class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        if(nums.length==0 || k==0) return res;
        int p=0;

        HashMap <Integer,Integer> map=new HashMap<> ();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue <Integer> pq= new PriorityQueue<>(
            (a,b)-> map.get(b)-map.get(a)
        );

        for(int i:map.keySet()){
            pq.offer(i);
        }

        for(int i=0;i<k;i++){
            res[p++]=pq.poll();
        }

        return res;
        
    }
}
