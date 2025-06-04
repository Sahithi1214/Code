class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int length = nums.length;
        int end = length - 1;
        
        return search(nums, length, target, start, end);
    }

    public int search(int[] nums, int length, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start + end)/2;

        if(target == nums[mid]){
            return mid;
        }
        if(target < nums[mid]){
            end = mid - 1;
            return search(nums, length, target, start, end);
        }else{
            start = mid + 1;
            return search(nums, length, target, start, end);
        }
    }
}