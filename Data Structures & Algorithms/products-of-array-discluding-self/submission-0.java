class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero=0;
        int arrayProduct=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            countZero++;
            else
            arrayProduct*=nums[i];
        }
        int res[]=new int[nums.length];
        if(countZero>1){
            for(int i=0;i<nums.length;i++)
            res[i]=0;
            return res;
        }
        if(countZero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=arrayProduct;
                }
                else{
                    res[i]=0;
                }
                
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                res[i]=arrayProduct/nums[i];
            }
        }
        return res;
    }
}  
