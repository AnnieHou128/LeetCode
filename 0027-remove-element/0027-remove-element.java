class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        //int indexBack = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}