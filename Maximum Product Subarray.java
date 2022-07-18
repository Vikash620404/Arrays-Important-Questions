class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
         int product=1;
      int maxProduct=Integer.MIN_VALUE ;
      for(int i=0;i<n;i++){
          product*=arr[i];
          maxProduct=Math.max(maxProduct,product);
          if(product==0)
          product=1;
      }
      product=1;
      for(int i=n-1;i>=0;i--){
          product*=arr[i];
          maxProduct=Math.max(maxProduct,product);
          if(product==0)
          product=1;
      }
      return maxProduct;
    }
}



//O(N)
