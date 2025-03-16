//Reverse only odd indexed of the elements of given array?
package Arrays;
import java.util.Arrays;

public class ReverseOnlyOdd {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 8};  //[3, 8, 2, 6, 1, 4]
        oddOnlyReverse(arr);
    }
    public static void oddOnlyReverse(int[] arr){
        int res[] = Arrays.copyOf(arr, arr.length);
        int index = arr.length-1;


        for(int i = 1; i<arr.length; i=i+2){
            if(i%2!=0){
                res[index] = arr[i];
                index -= 2;
            }
        }
        System.out.println("The reversed even indexed elements from an array: "+ Arrays.toString(res));

    }
    
}
