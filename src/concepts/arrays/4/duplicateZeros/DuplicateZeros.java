import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class DuplicateZeros{
    private void duplicateZeros(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (arr[i]==0)
                queue.add(0);
            arr[i]= queue.remove();

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
       DuplicateZeros duplicateZeros = new DuplicateZeros();
       duplicateZeros.duplicateZeros(arr);
    }
}