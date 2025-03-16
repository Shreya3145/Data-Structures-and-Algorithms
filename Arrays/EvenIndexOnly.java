//Read only even indexed elements from an array?
package Arrays;
import java.util.Arrays;

public class EvenIndexOnly {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        evenOnly(arr);
    }
    public static void evenOnly(int[] arr){
        int res[] = new int[arr.length/2];
        int index = 0;
        for(int i = 0; i<arr.length-1; i=i+2){
            res[index++] = arr[i];
        }
        System.out.println("The even indexed elements from an array: "+ Arrays.toString(res));

    }
    
}
