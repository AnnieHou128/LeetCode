class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] arr, int target, int left, int right){
        if(left > right){
            return -1;
        }

        int mid = left + (right - left)/2;
        System.out.println(mid);
        System.out.println(arr[mid]);
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return binarySearch(arr, target, left, mid-1);
        }else{
            return binarySearch(arr, target, mid+1, right);
        }
    }
}