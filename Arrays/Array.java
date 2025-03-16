package Arrays;
import java.util.*;
public class Array {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values: ");
        int arr[] = new int[n];
        
        for(int i=0; i < n; i++){

            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is: ");

        for(int i=0; i < n; i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The length is "+arr.length);
        sc.close();
    }
    
}
