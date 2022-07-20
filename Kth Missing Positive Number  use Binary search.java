Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.









class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count =0;
for(int i:arr){
    if(i>k) break;
k++;
}
return k;
    }
}

//O(N)








class Solution {
    public int findKthPositive(int[] arr, int k) {
   if(arr[0]>k) return k;                                            //using of binary search
int lo=0;
int hi=arr.length-1;
int closest_Mid=0;
while(lo<=hi){
    int mid=lo+(hi-lo)/2;
if(arr[mid]-(mid+1)<k){
    closest_Mid=mid+1;
    lo=mid+1;
        
}else{
    hi=mid-1;
}
}
return k+closest_Mid;
    }
}


//O(logN)
