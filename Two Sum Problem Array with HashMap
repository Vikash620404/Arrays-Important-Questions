class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] store =new int[2];
for(int i=0;i<nums.length;i++){                             //BRUTEFORCE APPROACH O(n^2)
                                                                                 // O(1)
    for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
            store[0]=i;
store[1]=j;
        }
    }
}
return store;  
    }
}










class Solution {
    public int[] twoSum(int[] nums, int target) {                            //OPTIMIZE APPROACH O(N)
      int[] store =new int[2];                                                 //O(N)
for(int i=0;i<nums.length;i++) // we iterate through num array
    {
        if(hm.containsKey(target - nums[i])) // we check for if at any index we have value that can make our target in hashmap, if found we keep value as below and key as index of that ele
        {
            res[1]=i;
            res[0]=hm.get(target - nums[i]);
            return res; // return res array
        }
         hm.put(nums[i],i); // if not found then also we need to keep value & index at hashmap for future checking
    }
   return res; // else return n
}
}
