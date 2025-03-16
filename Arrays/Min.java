//find the min element from the given int array?
package Arrays;
import java.util.Scanner;
public class Min{
    @SuppressWarnings("resource")
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The minimum value in the array is: " + min(arr));
        
        
    }
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}