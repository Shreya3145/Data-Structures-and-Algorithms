//find out the min from all even indexed element from the given int array?
package Arrays;
public class MinOfEvenIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        evenMin(arr);
    }
    public static void evenMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i=i+2){
            if(i%2==0){
                if(arr[i] < min)
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
