package Arrays;

import java.util.Scanner;

public class ArrayLength {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("The Array is: ");

        for(int i=0; i < n; i++){

            arr[i] = i+1;
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The length is "+arr.length);
        sc.close();
    }
}
