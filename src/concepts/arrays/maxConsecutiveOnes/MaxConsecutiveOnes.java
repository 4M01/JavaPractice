package concepts.arrays.maxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevOnesCount = 0;
        int onesCount = 0;
        for(int num : nums){
            if( num == 1){
                onesCount++;
            }else{
                prevOnesCount = (prevOnesCount>onesCount) ? prevOnesCount : onesCount;
                onesCount = 0;
            }
        }
        return (prevOnesCount>onesCount) ? prevOnesCount : onesCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int onesCount = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println("No of ones is given array: "+onesCount);
    }
}
