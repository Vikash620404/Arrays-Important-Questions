class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
      Arrays.sort(arr);
      Arrays.sort(dep);
      int arrival=0;
      int departure=0;
      int maxTrain=0;
      int platform=0;
      
      while(arrival<n&&departure<n){
      if(arr[arrival]<=dep[departure]){
          maxTrain++;
          arrival++;
      }else{
        maxTrain--;
        departure++;
      }
      platform=Math.max(platform,maxTrain);
      }
      return platform;
    }
    
}



//O(nlogn)
