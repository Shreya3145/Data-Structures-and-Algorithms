//Read only odd indexed elements from an array?
package Arrays;

import java.util.Arrays;

public class OddIndexOnly {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 8};
        oddOnly(arr);
    }
    public static void oddOnly(int[] arr){
        int res[] = new int[arr.length/2];
        int index = 0;
        for(int i = 1; i<arr.length; i=i+2){
            res[index++] = arr[i];
        }
        System.out.println("The odd indexed elements from an array: "+ Arrays.toString(res));

    }
    
}
