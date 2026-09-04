class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> prevNums=new ArrayList<Integer>();
        for (int num : nums) {
            // if (prevNum == null) {
            //     prev[0]
            // }

            for (int prev : prevNums) {
                if (prev == num) {
                    return true;
                }
            }
            prevNums.add(num);
        }
        return false;
    }
}