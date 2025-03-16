package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
        @SuppressWarnings("ConvertToTryWithResources")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of elements of 1st array");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the element one by one");
		for (int i=0; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("enter number of elements of 2nd array");
		int size2 = s.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("enter the element one by one");
		for (int i=0; i<arr2.length; i++) {
			arr2[i]=s.nextInt();
		}
		s.close();
		System.out.println("before removal,array-1 is " + Arrays.toString(arr) + "\n array-2 is " + Arrays.toString(arr2));
	   for(int i=0; i<arr.length; i++) {
		   for(int j=0; j<arr2.length; j++) {
			   if(arr[i]==arr2[j])	
				   arr[i] = Integer.MIN_VALUE;
		   }
	   }
	   int count=0;
		for(int a : arr) {
			if(a == Integer.MIN_VALUE)
				count++;	}
		int index=0;
		int[] res = new int[arr.length -count];
		for(int k=0; k<arr.length;k++) {
			if(arr[k]!=Integer.MIN_VALUE)
			 res[index++]= arr[k];  }
		System.out.println("after removal,  the array is " + Arrays.toString(res));
	}
}
