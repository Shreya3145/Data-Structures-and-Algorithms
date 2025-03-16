package Arrays;
import java.util.*;
public class ArrayInput {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int num = 1;

        System.out.println("The Array is: ");

        for(int i : arr){
            arr[i] = i + num;
            System.out.println(arr[i] + " ");
            num++;
        }
        System.out.println();
        System.out.println("The length is "+arr.length);
        sc.close();
    }
}
