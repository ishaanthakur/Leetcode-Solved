/**Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<m; i++) arr.add(nums1[i]);
        for(int i=0; i<n; i++)arr.add(nums2[i]);

        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++) nums1[i] = arr.get(i);
 
    }
}