class Solution { //-1,3,2
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            int j = i-1;
            int k = i+1;
            int sum = 1;
            while(j >= 0){
                sum*= nums[j];
                j--;
            }
            while(k < nums.length){
                sum*= nums[k];
                k++;
            }
            res[i] = sum;
        }

        return res;

        // int sum = nums[0];
        // boolean zero = false;
        // int[] res = new int[nums.length];
        // for(int i = 1;i<nums.length;i++){
        //     if(nums[i] == 0){
        //         zero = true;
        //         continue;
        //     }
        //     sum *= nums[i];
        // }

        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] == 0){
        //         res[i] = sum;
        //     }else if(zero){
        //         res[i] = 0;
        //     }else{
        //         res[i] = sum / nums[i];
        //     }
        // }
        // return res;
    }
}  
