package concepts.arrays.numbersWithEvenNumberOfDigits;

public class NumbersWithEvenNumberOfDigits {
    boolean isNumberContainEvenNumbersOfDigit (int number){
        int digitCount = 0;
        while(number != 0){
            number = number/10;
            digitCount++;
        }
        return (digitCount % 2 == 0)? true: false;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(isNumberContainEvenNumbersOfDigit(num))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
//        int[] nums = {555,901,482,1771};
        NumbersWithEvenNumberOfDigits numbers = new NumbersWithEvenNumberOfDigits();
        int count = numbers.findNumbers(nums);
        System.out.println("Number of element containing even digits in given array: "+count);
    }
}
