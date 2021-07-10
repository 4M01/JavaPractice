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

    public int[] optimalSortedSquares(int[] nums){
            int[] resultArray = new int[nums.length];
            int leftIndex=0;
            int rightIndex=nums.length-1;
            for (int i = nums.length-1; i >=0; i--) {
                if(Math.abs(nums[leftIndex]) > nums[rightIndex]){
                    resultArray[i] = nums[leftIndex] * nums[leftIndex];
                    leftIndex++;
                }else {
                    resultArray[i] = nums[rightIndex] * nums[rightIndex];
                    rightIndex--;
                }
            }
            return resultArray;
    }

    public static void main(String[] args) {
        int[] array =  {-4,-1,0,3,10};
//        int[] array = {-7,-3,2,3,11};
        SquaresOfASortedArray  squaresOfASortedArray = new SquaresOfASortedArray();
        System.out.println("Sorted array of square is :" +Arrays.toString(squaresOfASortedArray.optimalSortedSquares(array)));
    }
}
