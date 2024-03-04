import java.util.*;

public class Second_Smallest_Second_Largest_Element {

    static void second(int arr[]) {
        Arrays.sort(arr);
        System.out.println("second sammest: " + arr[1] + " Second largest: " + arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Array element: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        second(arr);
    }
}
