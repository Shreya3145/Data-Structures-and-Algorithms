//Read only odd indexed elements from an array in the reverse?
package Arrays;
import java.util.Arrays;

public class ReverseOddIndexOnly {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        oddOnlyReverse(arr);
    }
    public static void oddOnlyReverse(int[] arr){
        int res[] = new int[arr.length/2];
        int index = (arr.length/2)-1;
        for(int i = 1; i<arr.length; i=i+2){
            res[index--] = arr[i];
        }
        System.out.println("The reversed odd indexed elements from an array: "+ Arrays.toString(res));

    }
    
}
