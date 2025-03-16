package Arrays;
import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<size ; j++){
            sum += arr[j];
        }
        System.out.println(sum);
    }
}