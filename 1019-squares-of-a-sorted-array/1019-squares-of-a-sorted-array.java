class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int indexBack = nums.length - 1;
        int indexStart = 0;
        int i = nums.length - 1;
        while (indexStart <= indexBack){
                System.out.println(i);
                if (Math.abs(nums[indexStart]) > Math.abs(nums[indexBack])){
                    arr[i] = nums[indexStart] * nums[indexStart];
                    System.out.println("start:"+indexStart);
                    indexStart += 1;
                    i--;
                } else {
                    arr[i] = nums[indexBack] * nums[indexBack];
                    System.out.println("b:"+indexBack);
                    indexBack -= 1;
                    i--;
                }
            
        }
        return arr;
    }
}