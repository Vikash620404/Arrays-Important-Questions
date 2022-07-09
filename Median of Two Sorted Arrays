class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = merge(nums1, nums2);
int length=merge.length;
double ans=0.0;
int mid=merge.length/2;
if((length%2)==0)
ans=(merge[mid]+merge[mid-1])/2.;
else
ans=merge[mid];
  return ans; 

    }
public int[] merge(int[] nums1, int[] nums2){
int len1=nums1.length;
int len2=nums2.length;
int[]merged=new int[len1+len2];       //O(n)
int start1=0;
int start2=0;
int fill=0;
while(start1<len1&&start2<len2){
if(nums1[start1]<nums2[start2]){        //O(len1)
merged[fill]=nums1[start1];
start1++;
fill++;
}else if(nums1[start1]<=nums2[start2]){
merged[fill]=nums2[start2];                 //    O(len2)                   
start2++;
fill++;
}
}
while(start1<len1){
merged[fill]=nums1[start1];
start1++;
fill++;
}
while(start2<len2){
merged[fill]=nums2[start2];
start2++;
fill++;
}
return merged;
}
}




O(len1+len2)
O(n)
