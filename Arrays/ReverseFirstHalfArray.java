//Reverse only first half of the elements of given array?
package Arrays;
import java.util.Arrays;

public class ReverseFirstHalfArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        ReverseOfFirstHalf(arr);
    }

    public static void ReverseOfFirstHalf(int[] arr) {
        int n = arr.length;
        int count = n / 2;
        int[] res = Arrays.copyOf(arr, n); 

        for (int i = 0; i < count; i++) {
            res[i] = arr[count - 1 - i];
        }

        if (n % 2 != 0) {
            res[count] = arr[count];
        }

        System.out.println("The reverse of the first half: " + Arrays.toString(res));
    }
}