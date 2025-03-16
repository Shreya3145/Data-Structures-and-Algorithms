//Reverse only last half of the elements of given array?
package Arrays;
import java.util.Arrays;

public class ReverseLastHalfArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        ReverseOfLastHalf(arr);
    }

    public static void ReverseOfLastHalf(int[] arr) {
        int n = arr.length; //6
        int count = n / 2; //3
        int[] res = Arrays.copyOf(arr, n); 

       
        for (int i = count; i < n; i++) {
            res[i] = arr[n - 1 - (i - count)]; //6-1-(3-3) = 5, /6-1-(4-3) = 4, /6-1-(5-3) = 3, 
        }

        System.out.println("The reverse of the last half: " + Arrays.toString(res));
    }
}