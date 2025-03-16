//Reverse only even indexed of the elements of given array?
package Arrays;
import java.util.Arrays;

public class ReverseOnlyEven {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4}; //[1, 4, 2, 6, 3, 4]
        evenOnlyReverse(arr);
    }
    public static void evenOnlyReverse(int[] arr){
        int res[] = Arrays.copyOf(arr, arr.length);
        int index = arr.length;
        
        for(int i = 0; i<arr.length; i=i+2){
            index = index - 2;
            res[index] = arr[i];
        }
        System.out.println("The reversed even indexed elements from an array: "+ Arrays.toString(res));

    }
    
}
