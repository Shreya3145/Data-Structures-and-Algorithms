package Arrays;
import java.util.Arrays;
public class TwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(getArray(arr1, arr2)));
    }
    public static int[] getArray(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        for(int i=0; i<res.length; i++){
            if(i<arr1.length){
                res[i] = arr1[i];
            }
            else{
                res[i] = arr2[i-arr1.length];

            }
        }
        return res;
    }
    
}
