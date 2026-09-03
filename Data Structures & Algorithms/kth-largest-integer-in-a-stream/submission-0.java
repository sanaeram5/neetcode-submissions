class KthLargest {
    // List<Integer> arr;
    // int K;
    private PriorityQueue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        // K=k;
        // arr=new ArrayList();
        // for(int i=0;i<nums.length;i++){
        //     arr.add(nums[i]);
        // }
        this.k=k;
        this.minHeap=new PriorityQueue<>();
        for(int num:nums){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        // arr.add(val);
        // Collections.sort(arr);
        // return arr.get(arr.size()-K);
        minHeap.offer(val);
        if(minHeap.size()>k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
