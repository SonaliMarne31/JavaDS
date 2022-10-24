package Arrays;

public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int mid, start = 0, end = nums.length - 1;
        while (start <= end) {
              mid = start + (end - start) / 2;
              if (nums[mid] == target) return mid;
              if (target < nums[mid]) end = mid - 1;
              else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        System.out.println(SearchInsertPos.searchInsert(nums, 5));
    }
}
