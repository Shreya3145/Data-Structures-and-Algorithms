//Read first half of the elements in the reverse direction from an array?
package Arrays;
import java.util.Arrays;
public class ReverseFirstHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        ReverseOfFirstHalf(arr);
    }
    public static void ReverseOfFirstHalf(int[] arr){
        int count = arr.length/2;
        int res[] = new int[count];

        for(int i = 0 ; i < res.length ; i++){
                res[count-1] = arr[i];
                count--;

        }
        System.out.println("The reverse from a first half : "+ Arrays.toString(res));

    }
    
}
