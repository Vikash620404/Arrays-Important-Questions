Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).

  
 //Brute Force O(n^2) 
  
  class Solution
{
  static long inversionCount(long arr[], long N)
   {
       long count =0;
for(int i=0;i<N;i++){
for(int j=i+1;j<N;j++){
if(arr[i]>arr[j]&&i<j){
count++;
}
}
}
return count;      
   }
  }






//Optimize approach by using merge sort
//O(nlogn)
//o(n)


