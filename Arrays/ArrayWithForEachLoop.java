package Arrays;

import java.util.Scanner;

public class ArrayWithForEachLoop {
     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ;  i < n; i++){
            arr[i]=i+1;
        }
        System.out.println("The Array is: ");
        for( int a : arr ){
            System.out.print(a+" ");
        }
        sc.close();  
}
}
