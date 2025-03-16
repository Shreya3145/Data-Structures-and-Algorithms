package Arrays;
import java.util.Scanner;
public class TwoDime {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for a two dimensional array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter vales for array: ");
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
            System.out.println();
        }
        
        
    }
    
}
