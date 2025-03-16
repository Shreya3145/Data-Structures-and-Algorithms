//Read second half of the elements in the reverse direction from an array?
package Arrays;
import java.util.Arrays;

public class ReverseSecondHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        ReverseOfSecondHalf(arr);
    }
    public static void ReverseOfSecondHalf(int[] arr){
        int count = arr.length/2;
        int res[] = new int[count];
        int index = 0; 

        for (int i = arr.length - 1; i >= count; i--) { 
            res[index++] = arr[i];
        }

        System.out.println("The reverse from a second half : "+ Arrays.toString(res));

    }
}
