package Arrays;
public class ArrayBasic {
    public static void main(String[] args) {
        int arr[];
        arr = new int[3]; //arr[] = {1,2,3,4,5}; wrong one!
        arr[0] = 10;
        int b = 20;
        arr[1] = b;
        arr[2] = 10+20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);    
}
}
