class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int[] merge = merge(nums1, nums2);
int length=merge.length;
double ans;
int mid=merge.length/2;
if((length%2)==0)
ans=(merge[mid]+merge[mid-1])/2.;
else
ans=merge[mid];
  return ans; 
        
    }
public int[] merge(int[] nums1,int[] nums2){
int m=nums1.length;
int n=nums2.length;
int[] store=new int[m+n];
int start1=0;
int start2=0;
int k=0;
while(start1<m&&start2<n){
    if(nums1[start1]<nums2[start2]){
       store[k]=nums1[start1];
start1++;
    }else{
        store[k]=nums2[start2];
start2++;
    }
k++;
}
while(start1<m){
    store[k]=nums1[start1];
start1++;
k++;
}
while(start2<n){
    store[k]=nums2[start2];
start2++;
k++;
}
return store;
    
}
}






//O(NlogN)
//O(N)
