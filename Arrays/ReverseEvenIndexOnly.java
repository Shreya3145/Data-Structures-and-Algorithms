//Read only even indexed elements from an array in the reverse?
package Arrays;

import java.util.Arrays;

public class ReverseEvenIndexOnly {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        evenOnly(arr);
    }
    public static void evenOnly(int[] arr){
        int res[] = new int[arr.length/2];
        int index = (arr.length/2)-1;
        for(int i = 0; i<arr.length; i=i+2){
            res[index--] = arr[i];
        }
        System.out.println("The reversed even indexed elements from an array: "+ Arrays.toString(res));

    }
    
}
