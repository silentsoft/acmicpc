import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return findMedianSortedArray(Arrays.stream(nums2).boxed().toArray(Integer[]::new));
        } else if (nums2.length == 0) {
            return findMedianSortedArray(Arrays.stream(nums1).boxed().toArray(Integer[]::new));
        }

        Queue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());
        for (int num : nums1) {
            pq.add(num);
        }
        for (int num : nums2) {
            pq.add(num);
        }
        Integer[] nums = new Integer[nums1.length + nums2.length];
        for (int i=0; pq.isEmpty() == false; i++) {
            nums[i] = pq.poll();
        }
        return findMedianSortedArray(nums);
    }

    public double findMedianSortedArray(Integer[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int mid   = nums.length / 2;
        int left  = (nums.length % 2 == 1) ? nums[mid] : nums[mid-1];
        int right = nums[mid];
        return (left + right) / 2.0;
    }
}