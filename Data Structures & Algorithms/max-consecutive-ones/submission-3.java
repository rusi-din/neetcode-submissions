class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int tempCounter = 0;
        int prevNum=0;
        for (int num : nums) {
            if (prevNum != num) {
                prevNum = num;
                tempCounter = 1;
            } else {
                tempCounter++;
            }
            if (tempCounter >= counter &&  prevNum==1) {
                counter = tempCounter;
            }
        }

        return counter;
    }
}