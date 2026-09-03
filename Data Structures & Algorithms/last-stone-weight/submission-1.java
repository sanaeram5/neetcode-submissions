class Solution {
    public int lastStoneWeight(int[] stones) {
    //    List<Integer> stoneList = new ArrayList<>();
    //    for(int stone:stones){
    //     stoneList.add(stone);
    //    }
    //    while(stoneList.size()>1){
    //     Collections.sort(stoneList);
    //     int cur=stoneList.remove(stoneList.size()-1)-stoneList.remove(stoneList.size()-1);
    //     if(cur!=0)
    //     stoneList.add(cur);
    //    }
    //    return stoneList.isEmpty()?0:stoneList.get(0);
    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    for(int s:stones){
        minHeap.offer(-s);
    }
    while(minHeap.size()>1){
        int first=minHeap.poll();
        int second=minHeap.poll();
        if(second>first)
        minHeap.offer(first-second);
    }
    minHeap.offer(0);
    return Math.abs(minHeap.peek());
    }
}
