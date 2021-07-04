package concepts.arrays.squaresOfSortedArray;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
//        int[] array =  {-4,-1,0,3,10};
        int[] array = {-7,-3,2,3,11};
        SquaresOfASortedArray  squaresOfASortedArray = new SquaresOfASortedArray();
        System.out.println("Sorted array of square is :" +Arrays.toString(squaresOfASortedArray.sortedSquares(array)));
    }
}
