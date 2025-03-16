package Arrays;
import java.util.Scanner;
public class ReverseArray2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values: ");
        int arr[] = new int[n];
        
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}