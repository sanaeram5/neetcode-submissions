class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int n=temperatures.length;
        // int res[]=new int[n];
        // for(int i=0;i<n;i++){
        //     int count=1;
        //     int j=i+1;
        //     while(j<n){
        //         if(temperatures[j]>temperatures[i])
        //         break;
        //         j++;
        //         count++;
        //     }
        //     count=(j==n)?0:count;
        //     res[i]=count;
        // }
        // return res;

        int res[]=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            int t=temperatures[i];
            while(!stack.isEmpty() && t>temperatures[stack.peek()]){
                int temp=stack.pop();
                res[temp]=i-temp;
            }
            stack.push(i);
        }
        return res;
    }
}
