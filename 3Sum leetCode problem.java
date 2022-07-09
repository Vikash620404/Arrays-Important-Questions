class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet();
if(nums.length==0) return new ArrayList<>();
Arrays.sort(nums);
for(int i=0;i<nums.length;i++){
    int j=i+1;
int k=nums.length-1;
while(j<k){
    int sum=nums[j]+nums[k];                                                     //O(N^2)
if(sum==-nums[i]){                                                                //O(1)
    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
}else if(sum>-nums[i]){
    k--;
}else if(sum<-nums[i]){
    j++;
}
}
}  
return new ArrayList<>(res);  
    }
}
