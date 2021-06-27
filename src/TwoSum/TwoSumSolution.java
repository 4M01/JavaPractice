package TwoSum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]),i};
            }
            map.put(complement,i);
        }
        throw new IllegalArgumentException("No Two Sum Solutions");
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        TwoSumSolution solution = new TwoSumSolution();
        System.out.println("Solution is =>"+ Arrays.toString(solution.twoSum(array, target)));
    }
}
